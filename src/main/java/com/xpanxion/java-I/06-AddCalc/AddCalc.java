//package com.xpanxion.java-I.06-AddCalc;

import java.util.Scanner;

public class AddCalc {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        try {
            System.out.println("Please enter two numbers: ");
            int num1 = console.nextInt();
            int num2 = console.nextInt();
            int sum = num1 + num2;

            System.out.println(sum);
        } finally {
            console.close();
        }
    }
}
