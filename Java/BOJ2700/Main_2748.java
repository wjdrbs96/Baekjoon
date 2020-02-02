package Baekjoon.Java.BOJ2700;

import java.util.Scanner;

public class Main_2748 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        long[] list = new long[n + 1];

        list[1] = 1;

        for (int i = 2; i <= n; ++i) {
            list[i] = list[i - 1] + list[i - 2];
        }

        System.out.println(list[n]);

    }
}
