package com.rightfind.operatorNFunctionOverloading;
public class FnOoverloading {
        public static void main(String[] args) {
            int a = 180;
            double b = 5678.21452;
            char c = 'M';
            char d = 'a';
//          String m =c+h;
            String e = "Hello, Anu";
            boolean f = true;
            float g= 780.55F;
            short h = 50;
            long i = 7896541L;
//            System.out.println("Printing different data types using System.out.println() method are:");
//            System.out.println(a);
//            System.out.println(b);
//            System.out.println(c);
//            System.out.println(c+d);
//            System.out.println(e);
//            System.out.println(f);
//            System.out.println(g);
//            System.out.println(h);
//            System.out.println(i);
            System.out.println("Operator Overloading:");
            System.out.println(a+a);
            System.out.println(b+b);
            System.out.println(c+c);
            System.out.println(e+e);
//            System.out.println(f+f); //boolean is not supported by operator
            System.out.println(g+g);
            System.out.println(h+h);
            System.out.println(i+i);
            Student sc=new Student();
            System.out.println(sc); //print object hashcode
            System.out.println(String.valueOf(sc));

        }
    }
    class Student{
        int a=15;
    }
