package com.rakshith;

import java.util.Scanner;

public class Q2_c {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Principle: ");
        int p = in.nextInt();
        System.out.println();
        System.out.print("Enter the Rate of interest: ");
        int r = in.nextInt();
        System.out.println();
        System.out.print("Enter the time: ");
        int t = in.nextInt();
        System.out.println();
        int SI = (p * r * t) / 100;
        System.out.print("Simple interest: " + SI);

    }
}
