package com.company;

import java.util.Scanner;

public class E5 {
    public static void main (String[] args){
        Scanner sr = new Scanner(System.in);
        int q=0;
        int[]n=new int[99];
        for (int i = 0; i <n.length ; i++) {
            n[i]=sr.nextInt();
            if (n[i]==0){
                break;
            }
        }
        for (int i = 0; i <n.length ;) {
            int r=n[i+2];
            if (n[i]==0){
                break;
            }
            if (r==n[i+3]){
                i=i+2;
                q++;
            }else {
                i=i+3;
                q++;
            }

        }
        System.out.println(q);
    }
}
