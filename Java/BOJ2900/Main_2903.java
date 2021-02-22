package Baekjoon.Java.BOJ2900;

import java.util.Scanner;

public class Main_2903 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        if (n == 1) System.out.println((int) Math.pow(3, 2));
        if (n == 2) System.out.println((int) Math.pow(5, 2));

        int a = 5;
        for (int i = 3; i <= n; ++i) {
            if (i == n) System.out.println((int) Math.pow(2 * a - 1, 2));
            a = a + a - 1;

        }


    }
}
