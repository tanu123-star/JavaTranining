package com.qascript;
import java.util.Arrays;
public class ArrayClass {
    public static void main(String[] args) {
        int array[] = {1,2,3};
        int array2[] = {1,2,3,4};
        Arrays.sort(array);
        System.out.println("length of the array is " + array.length);
        System.out.println("sorting  of the array " + Arrays.toString(array));

           boolean status = Arrays.equals(array,array2);
           if(status==true) {
               System.out.println("arrays are same");
           }
           else{
               System.out.println("arrays are not same");
        }
    }
}