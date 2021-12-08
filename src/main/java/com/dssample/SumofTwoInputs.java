package com.dssample;

import java.util.Scanner;

public class SumofTwoInputs {


    /*
     * Programm returns takes two input print sum
     *
     * */

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int a = in.nextInt();
        int b = in.nextInt();

        int result = sum(a, b);

        System.out.println("Sum is:" + result);

    }


}
