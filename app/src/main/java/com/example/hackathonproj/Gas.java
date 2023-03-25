package com.example.hackathonproj;

public class Gas {

    private int insideTank;
    private int tankMax;

    public Gas(){
        insideTank = -1;
        tankMax = -1;
    }
    public Gas(int insideTank, int tankMax){
        this.insideTank = insideTank;
        this.tankMax = tankMax;
    }

    public int getInsideTank() {
        return insideTank;
    }

    public void setInsideTank(int insideTank) {
        this.insideTank = insideTank;
    }

    public int getTankMax() {
        return tankMax;
    }

    public void setTankMax(int tankMax) {
        this.tankMax = tankMax;
    }
}
