package com.tehk42;

public class Main {

    public static void main(String[] args) {
        //for loop solution
        for(int i = 0; i < 101; i++) {
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

        int i = 0;
        //while solution
//        while(i < 100) {
//            i++;
//            if(i % 15 == 0) {
//                System.out.println("FIZZBUZZ");
//            } else if(i % 5 == 0) {
//                System.out.println("BUZZ");
//            } else if(i % 3 == 0) {
//                System.out.println("FIZZ");
//            } else {
//                System.out.println(i);
//            }
//        }

        //do while solution
        do {
            if (i % 15 == 0) {
                System.out.println("FIZZBUZZ");
            } else if (i % 5 == 0) {
                System.out.println("BUZZ");
            } else if (i % 3 == 0) {
                System.out.println("FIZZ");
            } else {
                System.out.println(i);
            }
            i++;
        } while(i < 101);
    }
}
