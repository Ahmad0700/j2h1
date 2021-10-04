package com.company;

public class Galaxy extends Samsung{
    private String smartPhone;

    public Galaxy(String corporation,  Hotels hotels, String smartPhone) {
        super(corporation,  hotels);
        this.smartPhone = smartPhone;
    }

    public String getSmartPhone() {
        return smartPhone;
    }
    public String smartphoneInfo(String smartPhone){
        return "Название смартфона: " + this.smartPhone;
    }
    public final String smartphoneInfo(int smartphoneNumber){
        return "Номер смартфона: " + smartphoneNumber ;
    }


    public String getInfo() {
        return super.smartInfo() + "\nИгровая Консоль: " + smartPhone;
    }
}