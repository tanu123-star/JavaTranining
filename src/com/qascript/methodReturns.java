package com.qascript;

public class methodReturns {
    public static void main(String[] args) {
    addNumbers(2,3);
    addNumbers(5,6);

    int result = addNumbers(5,6);
    int output = result+5;
    System.out.println("added another number to the results " + output);
}
public static int addNumbers(int num1, int num2){
    int add = num1+num2;
    System.out.println("the addition is " +add);
    return add;
}
}
