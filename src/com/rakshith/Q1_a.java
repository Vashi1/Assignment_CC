package com.rakshith;

import java.util.Scanner;

public class Q1_a{
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the year: ");
    int a = in.nextInt();
    boolean b = checkLeap(a);
    if (b == true){
        System.out.println("The year " + a + " is a leap year");
    }
    else if (b == false){
        System.out.println("The year " + a + " is not a leap year");
    }
    }
    static boolean checkLeap(int a){
        if (a == 2000){
            return false;
        }
        else if (a % 4 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
