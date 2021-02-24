package Baekjoon.Java.BOJ11000;

import java.util.Scanner;

public class Main_11047_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();

        int[] list = new int[n + 1];
        int count = 0;

        for (int i = 1; i < list.length; ++i) {
            list[i] = input.nextInt();
        }

        for (int i = n; i >= 1; --i) {
            if (list[i] <= k) {
                count += (k / list[i]);
                k = k % list[i];
            }
        }

        System.out.println(count);
    }
}
