package com.company;

public class KV2 extends Tank{

    public KV2(int weight, int horsePower, int widthArmor) {
        super(weight, horsePower);
        this.widthArmor = widthArmor;

    }
    private int widthArmor;

    public int getWidthArmor() {
        return widthArmor;
    }
    public  void print(){
        System.out.println(getInfo() + "\nWidth armor: " + widthArmor);
    }
}
