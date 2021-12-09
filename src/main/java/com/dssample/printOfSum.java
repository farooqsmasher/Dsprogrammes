package com.dssample;

import java.util.Scanner;

public class printOfSum {


    public static void main(String[] args) {

        System.out.println("Enter the number:");

        Scanner in = new Scanner(System.in);

        int sum = 0;
        String s1;
        do {

            s1 = in.nextLine();
            if (s1.equalsIgnoreCase("x")) {
                break;
            }
            int number = Integer.parseInt(s1);
            sum += number;

            System.out.println("sum of all number is :" + sum);
        } while (s1 != null);


    }

}
