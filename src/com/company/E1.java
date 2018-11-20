package com.company;

import java.util.Scanner;

public class E1 {
    public static void main (String[] args){
        Scanner sr = new Scanner(System.in);
        int q=0;
        int n = sr.nextInt();
        for (int i = 1; i <=n; i++) {
            if ((n%i)==0){
                q++;
            }
        }
        System.out.println(q);
    }
}
