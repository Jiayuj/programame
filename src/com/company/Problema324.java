package com.company;

import java.util.Scanner;

public class Problema324 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt(),c=0;
        sc.nextLine();
            String w = sc.nextLine();
            String e[] = w.split(" ");
            int n[] = new int[e.length];
            int n1[] = new int[e.length];
            for (int i = 0; i <e.length ; i++) {
                n[i]=Integer.parseInt(e[i]);
                n1[i]=Integer.parseInt(e[i]);
            }
            while (q != 0){
                for (int i = 0; i < e.length; i++) {
                    int g = n1[i];
                    n[g - 1] = g;
                    c++;
                }
                for (int i = 0; i < e.length; i++) {
                    int g = n[i];
                    n[g - 1] = g;
                }
            q--;
        }
    }
}
