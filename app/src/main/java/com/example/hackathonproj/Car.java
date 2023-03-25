package com.example.hackathonproj;

public class Car {

    private String make;
    private String model;
    private int year;
    private String tires;
    private String oil;
    private Gas gas;
    private double mpg;
    private int miles;


    public Car(){
        make = "";
        model = "";
        tires = "";
        miles = -1;
        oil = "";
        gas = new Gas();
        mpg = -1.0;
        year = -1;

    }
    public Car(String make, String model, String tires, int miles, String oil, int year){
        this.make = make;
        this.model = model;
        this.tires = tires;
        this.miles = miles;
        this.oil = oil;
        this.gas = null;
        this.mpg = -1.0;
        this.year = year;

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTires() {
        return tires;
    }

    public void setTires(String tires) {
        this.tires = tires;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public String getOil() {
        return oil;
    }

    public void setOil(String oil) {
        this.oil = oil;
    }

    public Gas getGas() {
        return gas;
    }

    public void setGas(Gas gas) {
        this.gas = gas;
    }

    public double getMpg() {
        return mpg;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
