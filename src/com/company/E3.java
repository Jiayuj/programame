package com.company;

import java.util.Scanner;

public class E3 {
    public static void main (String[] args){
        Scanner sr = new Scanner(System.in);
        int n1 = sr.nextInt(), n2 = sr.nextInt(), r = sr.nextInt();
        if ((n1+n2)==r){
            System.out.println("+");
        }else if((n1-n2)==r){
            System.out.println("-");
        }else if ((n1*n2)==r){
            System.out.println("*");
        }else if (n2 != 0) {
            if ((n1 / n2) == r) {
                System.out.println("/");
            }
        }else if (n2 != 0) {
            if ((n1%n2)==r) {
            System.out.println("%");
            }
        }else System.out.println("Imposible");
    }
}
