package com.qascript;
import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(100);
        arraylist.add(200);
        arraylist.add(300);

        System.out.println(arraylist.size());
        arraylist.remove(2);
        System.out.println(arraylist.size());
        System.out.println(arraylist.get(1));
    }
}
