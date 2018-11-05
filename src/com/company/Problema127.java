package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Problema127 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        in.nextLine();
        while (v != 0) {
            boolean q = true;
            ArrayList<String> fe = new ArrayList<String>();
            String nombre = in.nextLine();
            String n[] = nombre.split(" ");
            for (int i = 0; i < n.length; i++) {
                if (n[i].equals("F")) {
                    break;
                } else if (n[i].length() > 24) {
                    q = false;
                } else {
                    fe.add(n[i]);
                    if (fe.size() > 49) {
                        q = false;
                    }
                }
            }
            int s = Integer.parseInt(n[n.length - 2]);
            int c = Integer.parseInt(n[n.length - 1]);
            while (q == true) {
                if (fe.size() < s) {
                    System.out.println("TODOS TIENEN CAMA");
                } else if (s == 0) {
                    System.out.println("NADIE TIENE CAMA");
                } else {
                    int d = c - 1;
                    while (fe.size() != s) {
                        if (d < fe.size()) {
                            fe.remove(d);
                            d = d + c - 1;
                        } else if (d >= fe.size()) {
                            d = d - fe.size();
                        }
                    }
                    for (int i = 0; i < fe.size(); i++) {
                        if (i == 0) {
                            System.out.print(fe.get(i));
                        } else System.out.print(" " + fe.get(i));
                    }
                    System.out.println();
                }
                break;
            }
            v--;
        }
    }
}