package com.qascript;
import java.util.*;
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> languages = new  HashSet<>();
        languages.add("Hindi");
        languages.add("English");
        languages.add("Marathi");
        languages.add("French");
        languages.add("English"); //values getting printed from end if its duplicate

        System.out.println(languages);
        System.out.println(languages.size());



    }
}
