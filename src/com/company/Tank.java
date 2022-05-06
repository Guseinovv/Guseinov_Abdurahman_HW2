package com.company;

public class Tank implements Printable {
    public int getWeight() {
        return weight;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public Tank(int weight, int horsePower) {
        this.weight = weight;
        this.horsePower = horsePower;
    }

    private int weight;
    private int horsePower;
   @Override
    public void print() {

    }
    public String getInfo(){
       return "Weight: " + weight +
               "\nHorse power: " + horsePower;
    }
}
