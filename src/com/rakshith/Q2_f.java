package com.rakshith;

import java.util.Scanner;

public class Q2_f {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value in INR:");
        float a = in.nextFloat();
        float u = (float) (a * 0.013);
        System.out.println("The value in USD Is:");
        System.out.println(u);
    }
}
