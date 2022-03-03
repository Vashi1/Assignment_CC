package com.rakshith;

import java.util.Scanner;

public class Q2_a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int n = in.nextInt();
        if (n % 2 == 0){
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }
    }
}
