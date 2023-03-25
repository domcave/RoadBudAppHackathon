package com.example.hackathonproj;

public class Car {

    private String make;
    private String model;
    private Tire tires;
    private int miles;

    public Car(){
        make = "";
        model = "";
        tires = new Tire();
        miles = 0;
    }
    public Car(String make, String model, Tire tires, int miles){
        this.make = make;
        this.model = model;
        this.tires = tires;
        this.miles = miles;
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


}
