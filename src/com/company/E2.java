package com.company;

import java.util.Scanner;

public class E2 {
    public static void main (String[] args){
        //crea un lista1 guardado numero que introduce.
        //crea otra lista2 guardado posiscion.
        //si nemero de la lista1 repiter mas un en lista2
        //despres monstra en posicion mas de 2.
        Scanner sr = new Scanner(System.in);
        int q=0;
        int [] n = new int[4];
        int[] n1 =new int[10];
        for (int i = 0; i <n.length ; i++) {
           n[i]=sr.nextInt();
           n1[n[i]]++;
        }
        for (int i = 0; i <n1.length ; i++) {
            if (n1[i]>=2){
                System.out.println(i+" "+n1[i]);
            }else if (n1[i]==1){
                q++;
            }
            if (q==4){
                System.out.println(0);
                break;
            }
        }
    }
}
