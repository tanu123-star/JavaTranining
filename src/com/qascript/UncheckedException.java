package com.qascript;

public class UncheckedException {
    public static void main(String[] args) {
        handleArithmeticException(100);
        handleNullPointerExceptio(null);
    }

    public static void handleArithmeticException(int number){
        try{
            int a = number/0;
        }
         catch(ArithmeticException exception) {
             exception.printStackTrace();
         }
    }

    public static void handleNullPointerExceptio(String s){
        try{
            System.out.println(s.length());
        }
        catch(ArithmeticException exception) {
            exception.printStackTrace();
        }
    }
}

