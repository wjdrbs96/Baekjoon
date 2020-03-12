package Baekjoon.Java.BOJ2500;

import java.util.Scanner;

public class Main_2522 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        for (int i = 0; i < N; ++i) {
            for (int j = 1; j < N - i; ++j) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; ++k) {
                System.out.print("*");
            }
            System.out.println();
        }

        int p = N - 1;

        for (int i = 0; i < p; ++i) {
            for (int j = 0; j <= i; ++j) {
                System.out.print(" ");
            }
            for (int k = 0; k < p - i; ++k) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
