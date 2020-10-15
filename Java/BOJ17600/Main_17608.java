package Baekjoon.Java.BOJ17600;

import java.util.Scanner;

public class Main_17608 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int[] list = new int[N + 1];

        for (int i = 1; i < N + 1; ++i) {
            list[i] = input.nextInt();
        }

        int count = 1;
        int max = list[list.length - 1];
        for (int i = list.length - 2; i > 0; --i) {
            if (max < list[i]) {
                count++;
                max = list[i];
            }
        }

        System.out.println(count);
    }
}
