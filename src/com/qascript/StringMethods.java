package com.qascript;

public class StringMethods {
    public static void main(String[] args) {

        String s1 = "java is best language";
        String s2 = "to learn";

        System.out.println("the length of the string is: "+s1.length());
        System.out.println("upper case od the string is: "+s1.toUpperCase());
        System.out.println("lower case od the string is: "+s1.toLowerCase());
        System.out.println("the index of b is: "+s1.indexOf("b"));
        System.out.println("the char at 5 is: "+s1.charAt(5));
        System.out.println("comaparing the strings: "+s1.equals("java is best language"));
        System.out.println("trimming the spaces of strings: "+s1.trim());
    }
}
