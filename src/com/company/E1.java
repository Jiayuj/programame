package com.company;

import java.util.Scanner;

public class E1 {
    public static void main (String[] args){
        Scanner sr = new Scanner(System.in);
        int q=0;
        int n = sr.nextInt();
        for (int i = 0; i < n; i++) {
            int r=n%i;
            if (r=0){
                q++;
            }
        }
        System.out.println(w);
    }
}
