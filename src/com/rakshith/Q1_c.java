package com.rakshith;

import java.util.Scanner;

public class Q1_c {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        multiplication(n);
    }
    static void multiplication(int a){
        int f = 1;
        while(f <= 10){
            System.out.println(a + "x" + f + " = " + (f*a));
            f++;
        }
    }
}
