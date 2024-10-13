package com.qascript;

public class Bajaj extends Bike {

    public void run() {
        System.out.println("running");
    }


    public static void main(String[] args) {
        Bajaj b = new Bajaj();
        b.run();
        b.brake();


    }
}
