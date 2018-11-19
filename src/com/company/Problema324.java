package com.company;
import java.util.Scanner;
public class Problema324 {
    public static void main (String[] args){
        int c=0,l=0;
        Scanner sc = new Scanner(System.in);
        l = sc.nextInt();
        sc.nextLine();
        String w = sc.nextLine();
        String e[] = w.split(" ");
        int n[] = new int[e.length];
        int n1[] = new int[e.length];
        int n2[] = new int[e.length];
        for (int i = 0; i <e.length ; i++) {
            n[i]=Integer.parseInt(e[i]);
        }
        for (int i = 0; i < e.length; i++) {
            int g = n[i];
            n1[n[i] - 1] = g;
            c++;
        }
        if (n[0]==n1[0]&&n[0]==n2[0]) {
            System.out.println(c / l);
        }else {
            while (n[0] != n1[0] && n[0] != n2[0]) {
                for (int i = 0; i < e.length; i++) {
                    int g = n1[i];
                    n2[n[i] - 1] = g;
                    c++;
                }
            }
            while (n[0] != n1[0] && n[0] != n2[0]) {
                for (int i = 0; i < e.length; i++) {
                    int g = n2[i];
                    n1[n[i] - 1] = g;
                    c++;
                }
            }
            System.out.println(c / l);
        }
    }
}
