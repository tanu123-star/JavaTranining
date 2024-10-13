package com.qascript;
import java.util.*;
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer,String> languages = new HashMap<>();
        languages.put(1,"Hindi");
        languages.put(2,"English");
        languages.put(3,"Marathi");
        languages.put(4,"French");

        System.out.println(languages);
        if(languages.containsKey(1)){
            System.out.println(languages.get(1));
        }

        if(!languages.isEmpty()){
            System.out.println("hashmap contains mapping");
        }

        languages.remove(2);
        System.out.println(languages);

    }
}
