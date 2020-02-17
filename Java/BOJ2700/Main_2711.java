package Baekjoon.Java.BOJ2700;

import java.util.Scanner;

public class Main_2711 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 0; i < n; ++i) {
            int a = input.nextInt();
            String s = input.next();
            String p =  s.substring(0, a - 1) + s.substring(a);
            System.out.println(p);

        }
    }
}
