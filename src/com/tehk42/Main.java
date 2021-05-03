package com.tehk42;

public class Main {

    public static void main(String[] args) {
//        //for loop solution
        for(int i = 1; i <= 100; i++) {
            if(i % 15 == 0) {
                System.out.println("FIZZBUZZ");
            } else if(i % 5 == 0) {
                System.out.println("BUZZ");
            } else if(i % 3 == 0) {
                System.out.println("FIZZ");
            } else {
                System.out.println(i);
            }
        }
        System.out.println("\n");
        fizzBuzz(3,5,15);
//
//        int i = 0;
//        //while solution
////        while(i < 100) {
////            i++;
////            if(i % 15 == 0) {
////                System.out.println("FIZZBUZZ");
////            } else if(i % 5 == 0) {
////                System.out.println("BUZZ");
////            } else if(i % 3 == 0) {
////                System.out.println("FIZZ");
////            } else {
////                System.out.println(i);
////            }
////        }
//
//        //do while solution
//        do {
//            if (i % 15 == 0) {
//                System.out.println("FIZZBUZZ");
//            } else if (i % 5 == 0) {
//                System.out.println("BUZZ");
//            } else if (i % 3 == 0) {
//                System.out.println("FIZZ");
//            } else {
//                System.out.println(i);
//            }
//            i++;
//        } while(i < 101);
//
//        System.out.println("\r");
    }
    //method solution with interchangeable logic values
    public static void fizzBuzz(int x, int y , int z) {
        for(int i = 1; i <= 100; i++) {
            if(i % z == 0) {
                System.out.println("FIZZBUZZ");
            } else if(i % y == 0) {
                System.out.println("BUZZ");
            } else if(i % x == 0) {
                System.out.println("FIZZ");
            } else {
                System.out.println(i);
            }
        }
    }
}
