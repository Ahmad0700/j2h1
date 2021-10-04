package com.company;

public class Samsung {
    private String corporation;

    private Hotels hotels;

    public Samsung(String corporation, Hotels hotels) {
        this.corporation = corporation;

        this.hotels = hotels;
    }

    public String getCorporation() {
        return corporation;
    }



    public Hotels getHotels() {
        return hotels;
    }

    public String smartInfo(){
        return "Компания: " + corporation + "\nГлавный отель: " + hotels;
    }
}
