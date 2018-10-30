package com.company;
import java.util.Scanner;
public class Problema112 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            float m = in.nextFloat(), v = in.nextFloat(), s = in.nextFloat();
            if (m == 0 && v == 0 && s == 0) {
                System.exit(0);
            } else {
                if (m <= 0 || v <= 0 || s <= 0) {
                    System.out.println("ERROR");
                } else {
                    m = (m / 1000) / (s / 3600);
                    if (m < v) {
                        System.out.println("OK");
                    } else if (m > v && m < v * 1.2) {
                        System.out.println("MULTA");
                    } else {
                        System.out.println("PUNTOS");
                    }
                }
            }
        }
    }
}
