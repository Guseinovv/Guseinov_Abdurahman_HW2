package com.company;

public class Main {

    public static void main(String[] args) {
        Printable print[] = {createObject("oneObject"), createObject("twoObject"),
                createObject("threeObject")};
        for (Printable printable : print) {
            printable.print();
        }
    }

    public static Printable createObject(String className) {
        switch (className) {
            case "oneObject":
                KV1 kv1 = new KV1(43, 500, 75);
                return kv1;

            case "twoObject":
                KV2 kv2 = new KV2(52, 600, 70);
                return kv2;

            case "threeObject":
                KV3 kv3 = new KV3(678, 850, 90);
                return kv3;
        }
        return null;
    }
}


