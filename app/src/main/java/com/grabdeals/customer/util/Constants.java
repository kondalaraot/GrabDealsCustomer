package com.grabdeals.customer.util;

/**
 * Created by KTirumalsetty on 10/31/2016.
 */

public class Constants {
    public static final boolean DEBUG = true;

    public static final String HOST_URL = "http://tag.tollymovies.com/v1/";
//    public static final String USER_AVATAR_URL = "http://tag.tollymovies.com/v1/user/avatar/user_avatar_"; //Old
    public static final String USER_AVATAR_URL = "http://tag.tollymovies.com/assets/avatars/users/user_avatar_";
    public static final String USER_OFFER_AVATAR_URL = "http://tag.tollymovies.com/assets/offers/";

    public static final String API_IS_REGISTER = "user/is_register";
    public static final String API_SIGN_UP = "user/signup";
    public static final String API_LOGIN = "user/login";


    public static final String API_OFFER_ALL ="user/offers/list";
    public static final String API_OFFER_DETAILS_BY_ID = "user/offer/";
    public static final String API_SEND_OTP_SIGN_UP = "user/send_otp/1";
    public static final String API_SEND_OTP = "user/send_otp";
    
    public static final String API_USER_SET_PASSWORD = "user/set_password";
    public static final String API_USER_DELETE_OFFER = "user/delete/offer";
    public static final String API_USER_GET_PROFILE = "user/profile/"; //{acc_id}

    public static final int API_SEND_OTP_SIGN_UP_REQ_CODE = 3;
    public static final int API_SEND_OTP_REQ_CODE = 1;
    public static final int API_SIGN_UP_REQ_CODE = 2;
    public static final int API_USER_SET_PASSWORD_REQ_CODE = 7;
    public static final int API_USER_DELETE_OFFER_REQ_CODE = 8;
    public static final int API_USER_GET_PROFILE_REQ_CODE = 10;



}
