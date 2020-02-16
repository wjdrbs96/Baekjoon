package Baekjoon.Java.BOJ2600;

import java.util.Scanner;

public class Main_2605 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] list = new int[n];
        int[] key = new int[n];

        for (int i = 0; i < n; ++i) {
            list[i] = input.nextInt();
            key[i] = i + 1;
        }

        int tmp = 0;
        for (int i = 1; i < n; ++i) {
            int k = i;
            for (int j = 0; j < list[i]; ++j) {
                tmp = key[k];
                key[k] = key[k - 1];
                key[k - 1] = tmp;
                k--;
            }
        }

        for (int i = 0; i < n; ++i) {
            System.out.print(key[i] + " ");
        }
    }
}
