package com.rakshith;

import java.util.Scanner;

public class Q2_h {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        boolean b = Palindrome(a);
        if (b){
            System.out.println("The string is a palindrome");
        }
        else{
            System.out.println("The string is not a palindrome");
        }
    }
    static boolean Palindrome(String a){
        String nstr = "";
        for (int i = 0; i < a.length(); i++ ){
            char c = a.charAt(i);
            nstr = c + nstr;
        }
        if (nstr.equals(a)){
            return true;
        }
        else{
            return false;
        }
    }
}
