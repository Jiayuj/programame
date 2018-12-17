package com.company;

import java.util.Scanner;

public class Cuenta_números {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int v = sr.nextInt();
        int h = sr.nextInt();
        int [][] m = new int[v][h];
        int [][] m1 = new int[v][h];
        for (int i = 0; i <v; i++) {
            for (int j = 0; j <h ; j++) {
                m[i][j] = sr.nextInt();
                m1[i][j] = m[i][j];
            }
        }
        for (int i = 0; i <v ; i++) {
            for (int j = 0; j <h ; j++) {
                if (m[i][j]==1) {
                    if (i==0 && j==0){ //Ezq a
                        m1[i][j+1]++;
                        m1[i+1][j]++;
                        m1[i+1][j+1]++;
                    } else if (i==v-1 && j==0){ //Ezq b
                        m1[i-1][j]++;
                        m1[i][j+1]++;
                        m1[i-1][j+1]++;
                    } else if (i==0 && j==h-1){ //Dre a
                        m1[i][j-1]++;
                        m1[i+1][j]++;
                        m1[i+1][j-1]++;
                    } else if (i==v-1 && j==h-1){//Dre b
                        m1[i-1][j]++;
                        m1[i][j-1]++;
                        m1[i-1][j-1]++;
                    } else if (j>0&&j<h-1&&i==0){
                        m1[i+1][j]++;
                        m1[i][j-1]++;
                        m1[i][j+1]++;
                    }
                }
            }
        }
        for (int i = 0; i <v ; i++) {
            for (int j = 0; j <h ; j++) {
                if (j == h - 1) {
                    if (m[i][j]==1){
                        System.out.println(m[i][j]);
                    }else {
                        System.out.println(m1[i][j]);
                    }
                } else {
                    if (m[i][j]==1){
                        System.out.println(m[i][j] + " ");
                    }else {
                        System.out.print(m1[i][j] + " ");
                    }
                }
            }
        }
    }
}