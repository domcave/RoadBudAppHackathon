package com.example.hackathonproj;

public class Car {

    private String make;
    private String model;
    private int year;
    private Tire tires;
    private Oil oil;
    private Gas gas;
    private double mpg;
    private int miles;


    public Car(){
        make = "";
        model = "";
        tires = new Tire();
        miles = -1;
        oil = new Oil();
        gas = new Gas();
        mpg = -1.0;
        year = -1;

    }
    public Car(String make, String model, Tire tires, int miles, Oil oil, Gas gas, double mpg, int year){
        this.make = make;
        this.model = model;
        this.tires = tires;
        this.miles = miles;
        this.oil = oil;
        this.gas = gas;
        this.mpg = mpg;
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

    public Tire getTires() {
        return tires;
    }

    public void setTires(Tire tires) {
        this.tires = tires;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public Oil getOil() {
        return oil;
    }

    public void setOil(Oil oil) {
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
