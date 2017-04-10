package com.grabdeals.customer.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by KTirumalsetty on 11/17/2016.
 */

public class Offer implements Serializable {

   /* {
        "shop_id": "3",
            "shop_name": "Test Shop1",
            "shop_description": "Great shop..we care for customers",
            "shop_logo_path": "",
            "web_site": "www.testshop.com",
            "category_id": "1",
            "category_name": "Clothing & Accessories",
            "offer_id": "7",
            "title": "Big Billion sale offers",
            "description": "test offer big sale great offers on the way Tet itinggssbsddd fjjksksksksskls",
            "offer_start": "2016-12-15",
            "offer_end": "2016-12-19",
            "created_date": "2016-12-14 21:42:39",
            "locations": [
        {
            "city_id": "2",
                "area_id": "3",
                "city_name": "Hyderabad",
                "area_name": "Ameerpet"
        }
      ],
        "attachments": [
        {
            "image_path": "offer_3_7_1712567421_2016-12-14-21-42-41"
        },
        {
            "image_path": "offer_3_7_1802891919_2016-12-14-21-42-44"
        },
        {
            "image_path": "offer_3_7_1230714951_2016-12-14-21-42-45"
        }
      ]
    }*/

    private String shop_id;
    private String shop_name;
    private String shop_description;
    private String shop_logo_path;
    private String web_site;
    private String category_id;
    private String category_name;
    private String created_date;
    private String offer_end;
    private String title;
    private String offer_id;
    private String description;
    private String offer_start;
    List<Location> locations;
    List<Attachment> attachments;

    public Offer() {
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public String getOffer_end() {
        return offer_end;
    }

    public void setOffer_end(String offer_end) {
        this.offer_end = offer_end;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOffer_id() {
        return offer_id;
    }

    public void setOffer_id(String offer_id) {
        this.offer_id = offer_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOffer_start() {
        return offer_start;
    }

    public void setOffer_start(String offer_start) {
        this.offer_start = offer_start;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public String getShop_id() {
        return shop_id;
    }

    public void setShop_id(String shop_id) {
        this.shop_id = shop_id;
    }

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    public String getShop_description() {
        return shop_description;
    }

    public void setShop_description(String shop_description) {
        this.shop_description = shop_description;
    }

    public String getShop_logo_path() {
        return shop_logo_path;
    }

    public void setShop_logo_path(String shop_logo_path) {
        this.shop_logo_path = shop_logo_path;
    }

    public String getWeb_site() {
        return web_site;
    }

    public void setWeb_site(String web_site) {
        this.web_site = web_site;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }
}
