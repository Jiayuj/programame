package com.company;

import java.util.Scanner;

public class Problema174 {
    public static void main (String[] args){
        //resta numero que cuentra no esta repertida
        //con numero que cuentra suma hasta no esta repertida y contar vez que has sumado
        //dos grupo esta repertida y no esta repertida
        Scanner sc = new Scanner(System.in);
        int q=99, c=0, añoP=0,v=0;
        // q=1 es grup repertida.
        // q=0 es grup no repertida.
        int vez = sc.nextInt();
        while (vez != 0){
            //Clacificar grup de añor
            int año = sc.nextInt();
            int añoGuardado = año;
            int[] digitCount = new int[10];
            while (año != 0) {
                //Get the lastDigit of inputNumber
                int lastDigit = año % 10;
                //incrementing the lastDigit's count
                digitCount[lastDigit]++;
                //Removing the lastDigit from inputNumber
                año = año / 10;
            }
            año = añoGuardado;
            for (int i = 0; i < digitCount.length; i++) {
                if(digitCount[i] != 0) {
                    if (digitCount[i]==2){
                       q=1;
                       break;
                    }else q=0;
                }
            }
            // grup 1.
            while (q==1){
                año--;
                añoGuardado = año;
                digitCount = new int[10];
                while (año != 0) {
                    //Get the lastDigit of inputNumber
                    int lastDigit = año % 10;
                    //incrementing the lastDigit's count
                    digitCount[lastDigit]++;
                    //Removing the lastDigit from inputNumber
                    año = año / 10;
                }
                año = añoGuardado;
                c=0;
                for (int i = 0; i < digitCount.length; i++) {
                    if(digitCount[i] != 0) {
                        if (digitCount[i]==1){
                            c++;
                        }
                        if (c==4){
                            añoP = año+1;
                            System.out.print(añoP+" ");
                            q=2;
                        }
                    }
                }
            }
            //grup 0
            while (q==0){
                año--;
                añoGuardado = año;
                digitCount = new int[10];
                while (año != 0) {
                    //Get the lastDigit of inputNumber
                    int lastDigit = año % 10;
                    //incrementing the lastDigit's count
                    digitCount[lastDigit]++;
                    //Removing the lastDigit from inputNumber
                    año = año / 10;
                }
                año = añoGuardado;
                c=0;
                for (int i = 0; i < digitCount.length; i++) {
                    if(digitCount[i] != 0) {
                        if (digitCount[i]==2){
                            añoP = año+1;
                            System.out.print(añoP+" ");
                            q=3;
                        }
                    }
                }
            }
            // proceso
            while (q==2){
                añoP++;
                v++;
                añoGuardado = añoP;
                digitCount = new int[10];
                while (añoP != 0) {
                    //Get the lastDigit of inputNumber
                    int lastDigit = añoP % 10;
                    //incrementing the lastDigit's count
                    digitCount[lastDigit]++;
                    //Removing the lastDigit from inputNumber
                    añoP = añoP / 10;
                }
                añoP = añoGuardado;
                c=0;
                for (int i = 0; i < digitCount.length; i++) {
                    if(digitCount[i] != 0) {
                        if (digitCount[i]==1){
                            c++;
                        }
                        if (c==4){
                            System.out.println(v);
                            v=0;
                            q=99;
                        }
                    }
                }
            }
            while (q==3){
                añoP++;
                v++;
                añoGuardado = añoP;
                digitCount = new int[10];
                while (añoP != 0) {
                    //Get the lastDigit of inputNumber
                    int lastDigit = añoP % 10;
                    //incrementing the lastDigit's count
                    digitCount[lastDigit]++;
                    //Removing the lastDigit from inputNumber
                    añoP = añoP / 10;
                }
                añoP = añoGuardado;
                c=0;
                for (int i = 0; i < digitCount.length; i++) {
                    if(digitCount[i] != 0) {
                        if (digitCount[i]==2){
                            System.out.println(v);
                            v=0;
                            q=99;
                            break;
                        }
                    }
                }
            }
            vez--;
        }
    }
}
