package com.rakshith;

import java.util.Scanner;

public class Q2_g {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = in.nextInt();
        Fibonacci(n);
    }
    static void Fibonacci(int n){
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for(int i = 1; i <=  n - 2; i++){
            int c = a + b;
            System.out.println(c);
            int temp = b;
            b = c;
            a = temp;
//            int temp = b;
//            b = a + b;
//            a = temp;
//            System.out.println(a);
//            System.out.println(b);
        }
    }
}
