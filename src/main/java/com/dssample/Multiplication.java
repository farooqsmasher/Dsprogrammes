package com.dssample;

import java.util.Formatter;
import java.util.Scanner;

public class Multiplication {


    /*
     * Programm to print Multiplication of table
     * */

    public static void multiplicationTable(int a) {

        int num = 10;
        for (int i = 1; i <= num; i++) {

            Formatter formatter = new Formatter();
            formatter.format("%d * %d=%d", a, i, i * a);

            System.out.println(formatter);
        }

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int input = in.nextInt();

        multiplicationTable(input);
    }

}
