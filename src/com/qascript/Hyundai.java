package com.qascript;

public class Hyundai  extends JavaClassCar{
    public static void main(String[] args) {
        start();
        accelerate();
        brakes();

    }
    public static void brakes(){
        System.out.println("press the brakes");
    }

    public static void start(){ //method overriding
        String key = "ON";
        System.out.println("press the key " +key);
    }

}
