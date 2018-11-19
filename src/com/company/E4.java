package com.company;

import java.util.Scanner;

public class E4 {
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
        for (int i = 0; i <n.length ;i++) {
            if (n[i]==0){
                break;
            }else if (n[i+1]>n[i]){
                q++;
            }

        }
        System.out.println(q);

    }
}
