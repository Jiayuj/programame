package com.company;

import java.util.Scanner;

public class Problema174 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = 99, c, añoP = 0, v = 0;
        int vez = sc.nextInt();
        while (vez != 0) {
            //Clacificar grup de añor
            int año = sc.nextInt();
            int añoGuardado = año;
            int[] digitCount = new int[10];
            while (año != 0) {
                int lastDigit = año % 10;
                digitCount[lastDigit]++;
                año = año / 10;
            }
            año = añoGuardado;
            for (int i = 0; i < digitCount.length; i++) {
                if (digitCount[i] != 0) {
                    if (digitCount[i] == 2) {
                        q = 1;
                        // pasa a grupo 1. (rep).
                        break;
                    } else q = 0;//pass a grupo 0 (no rep)
                }
            }

            while (q == 1) {
                año--;
                añoGuardado = año;
                digitCount = new int[10];
                while (año != 0) {
                    int lastDigit = año % 10;
                    digitCount[lastDigit]++;
                    año = año / 10;
                }
                año = añoGuardado;
                c = 0;
                for (int i = 0; i < digitCount.length; i++) {
                    if (digitCount[i] >= 2) {
                        break;
                    } else c++;
                    if (c == digitCount.length) {
                        añoP = año + 1;
                        q = 2;//passa proceso 2 (rep)
                    }
                }
            }

            while (q == 0) {
                año--;
                añoGuardado = año;
                digitCount = new int[10];
                while (año != 0) {
                    int lastDigit = año % 10;
                    digitCount[lastDigit]++;
                    año = año / 10;
                }
                año = añoGuardado;
                c = 0;
                for (int i = 0; i < digitCount.length; i++) {
                    if (digitCount[i] != 0) {
                        if (digitCount[i] == 2) {
                            añoP = año + 1;
                            q = 3; //passa a proceso 3 (no rep).
                            break;
                        }
                    }
                }
            }

            while (q == 2) {
                añoP++;
                v++;
                añoGuardado = añoP;
                digitCount = new int[10];
                while (añoP != 0) {
                    int lastDigit = añoP % 10;
                    digitCount[lastDigit]++;
                    añoP = añoP / 10;
                }
                añoP = añoGuardado;
                c = 0;
                for (int i = 0; i < digitCount.length; i++) {
                    if (digitCount[i] <= 1) {
                        c++;
                    }
                    if (c == digitCount.length) {
                        System.out.println(añoP+" "+v);
                        v = 0;
                        q = 99;
                    }
                }
            }
            while (q == 3) {
                añoP++;
                v++;
                añoGuardado = añoP;
                digitCount = new int[10];
                while (añoP != 0) {
                    int lastDigit = añoP % 10;
                    digitCount[lastDigit]++;
                    añoP = añoP / 10;
                }
                añoP = añoGuardado;
                c = 0;
                for (int i = 0; i < digitCount.length; i++) {
                    if (digitCount[i] == 2) {
                        System.out.println(añoP+" "+v);
                        v = 0;
                        q = 99;
                        break;
                    }
                }
            }
            vez--;
        }
    }
}