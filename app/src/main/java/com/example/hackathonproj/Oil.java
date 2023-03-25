package com.example.hackathonproj;

public class Oil {

    private String brand;
    private String type;
    private int wearMax;
    private int miles;

    public Oil(){
        brand = "";
        type = "";
        wearMax = 0;
        miles = 0;
    }
    public Oil(String brand, String type, int wearMax, int miles){
        this.brand = brand;
        this.type = type;
        this.wearMax = wearMax;
        this.miles = miles;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWearMax() {
        return wearMax;
    }

    public void setWearMax(int wearMax) {
        this.wearMax = wearMax;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }
}
