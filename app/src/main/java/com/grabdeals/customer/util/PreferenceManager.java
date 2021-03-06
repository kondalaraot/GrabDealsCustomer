package com.grabdeals.customer.util;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

import com.grabdeals.customer.ui.LoginActivity;


/**
 * Created by KTirumalsetty on 11/2/2016.
 */

public class PreferenceManager {
    private static final String KEY_ACC_ID = "acc_id" ;
    private static final String KEY_SHOP_ID = "shop_id";
    private static final String KEY_SHOP_NAME ="shop_name" ;
    private static final String KEY_SHOP_WEBSITE ="web_site" ;
    private static final String KEY_SHOP_MOBILE_NO = "mobile_no";
    private static final String KEY_SHOP_PROFILE_URL = "shop_url";
    // Shared Preferences
    SharedPreferences mPreferences;

    // Editor for Shared preferences
    SharedPreferences.Editor mEditor;

    // Context
    Context mContext;

    // Shared pref mode
    int PRIVATE_MODE = 0;

    // Sharedpref file name
    private static final String PREF_NAME = "ShopKeeper";

    // All Shared Preferences Keys
    private static final String IS_LOGIN = "IsLoggedIn";

    // User name (make variable public to access from outside)
    public static final String KEY_AUTH_TOKEN = "auth_token";

    // Email address (make variable public to access from outside)
    public static final String KEY_EMAIL = "email";

    // Constructor
    public PreferenceManager(Context context){
        this.mContext = context;
        mPreferences = mContext.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        mEditor = mPreferences.edit();
    }

    public void setAuthToken(String authToken) {
        mEditor.putString(KEY_AUTH_TOKEN, authToken).commit();

    }
    public void setIsLogin(boolean isLoggedin) {
        mEditor.putBoolean(IS_LOGIN, isLoggedin).commit();

    }
    public void setAccountID(String accId) {
        mEditor.putString(KEY_ACC_ID, accId).commit();

    }
    public void setShopID(String shopID) {
        mEditor.putString(KEY_SHOP_ID, shopID).commit();

    }
    public void setShopName(String shopName) {
        mEditor.putString(KEY_SHOP_NAME, shopName).commit();

    } public void setShopMobileNO(String shopMobileNO) {
        mEditor.putString(KEY_SHOP_MOBILE_NO, shopMobileNO).commit();

    }
    public void setShopWebsite(String shopUrl) {
        mEditor.putString(KEY_SHOP_WEBSITE, shopUrl).commit();

    }
    public void setShopUrl(String shopImageUrl) {
        mEditor.putString(KEY_SHOP_PROFILE_URL, shopImageUrl).commit();

    }
    public String getAuthToken() {
        String bearerToken = mPreferences.getString(KEY_AUTH_TOKEN,"");
        return bearerToken;
    }
    public boolean getIsLoggedIn() {
        return mPreferences.getBoolean(IS_LOGIN,false);
    }
    public String getShopID() {
        return mPreferences.getString(KEY_SHOP_ID,"");
    }
    public String getShopMoBileNo() {
        return mPreferences.getString(KEY_SHOP_MOBILE_NO,"");
    }
    public String getShopWebsite() {
        return mPreferences.getString(KEY_SHOP_WEBSITE,"");
    }
    public String getShopName() {
        return mPreferences.getString(KEY_SHOP_NAME,"");
    }
    public String getAccID() {
        return mPreferences.getString(KEY_ACC_ID,"");
    }
    public String getShopUrl() {
        return mPreferences.getString(KEY_SHOP_PROFILE_URL,"");
    }

    /**
     * Clear session details
     * */
    public void logoutUser(){
        // Clearing all data from Shared Preferences
        mEditor.clear();
        mEditor.commit();

        // After logout redirect user to Loing Activity
        Intent i = new Intent(mContext, LoginActivity.class);
        // Closing all the Activities
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        // Add new Flag to start new Activity
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        // Staring Login Activity
        mContext.startActivity(i);
    }
}
