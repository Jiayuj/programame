package com.company;
import java.util.Scanner;
public class Problema433 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int uvas = 1;
        while (uvas > 0) {
            int c = 0, b = 0;
            uvas = in.nextInt();
            while (uvas > b) {
                c++;
                b = c + b;
            }
            if (c != 0) {
                System.out.println(c);
            }
        }
    }
}

