package Baekjoon.Java.BOJ9000;

import java.util.Scanner;

public class Main_9095 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] list = new int[11];
        list[1] = 1;
        list[2] = 2;
        list[3] = 4;


        for (int i = 0; i < n; ++i) {
            int t = input.nextInt();

            for (int j = 4; j <= t; ++j) {
                list[j] = list[j - 1] + list[j - 2] + list[j - 3];
            }

            System.out.println(list[t]);
        }

    }
}
