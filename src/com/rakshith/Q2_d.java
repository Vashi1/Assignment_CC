package com.rakshith;

import java.util.Objects;
import java.util.Scanner;

public class Q2_d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the two numbers: ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        System.out.println();
        System.out.print("Enter the sign of the opetator: ");
        String sign = in.next();
        if (Objects.equals(sign, "+")){
            int c = n1 + n2;
            System.out.println(c);
        }
        else if (Objects.equals(sign, "-")){
            int c = n1 - n2;
            System.out.println(c);
        }
        else if (Objects.equals(sign, "*")){
            int c = n1 * n2;
            System.out.println(c);
        }
        else if (Objects.equals(sign, "/")){
            if (n2 == 0){
                System.out.println("Divide by zero error");
            }
            else{
                int c = n1 / n2;
                System.out.println(c);
            }
        }
    }
}
