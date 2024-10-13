package com.qascript;

public class Delll implements Company {


       public void getProducts()
           {
               System.out.println("products");
           }

           public void getEmployees () {
               System.out.println("employees");
           }

           public static void main(String[] args)
           {
               Delll d = new Delll();
               d.getProducts();
               d.getEmployees();
           }

       }

