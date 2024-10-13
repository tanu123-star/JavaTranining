package com.qascript;
public class JavaClassCar {

    String color;
    int size;
    double weigth;

    public static void start() {
        System.out.println("start the car");
    }

    public static void accelerate() {
        System.out.println("press the accelerater");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public void displayCar() {
        System.out.println("the color of the car is " + color);
        System.out.println("the size of the car is " + size);
        System.out.println("the weigth of the car is " + weigth);
    }


    public static void main(String[] args) {
        JavaClassCar audi = new JavaClassCar();
        audi.setColor("black");
        audi.setSize(90);
        audi.setWeigth(90.5);
        audi.displayCar();
        JavaClassCar.start();  //static method
        JavaClassCar.accelerate(); //static method
    }
}
