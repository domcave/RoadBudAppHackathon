package com.example.hackathonproj;

public class Tire{

    private String manufacturer;
    private String model;
    private String type;
    private int wearMax;
    private int miles;

    public Tire(){
        manufacturer = "";
        model = "";
        type = "";
        wearMax = -1;
        miles = -1;
    }
    public Tire(String manufacturer, String model, String type, int wearMax, int miles){
        this.manufacturer = manufacturer;
        this.model = model;
        this.type = type;
        this.wearMax = wearMax;
        this.miles = miles;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public int getWearMax() {
        return wearMax;
    }

    public void setWearMax(int wearMax) {
        this.wearMax = wearMax;
    }

}
