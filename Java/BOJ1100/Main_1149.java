package Baekjoon.Java.BOJ1100;

import java.util.Scanner;

public class Main_1149 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[][] list = new int[n + 1][3];

        for (int i = 1; i <= n ; ++i) {
            list[i][0] = input.nextInt();
            list[i][1] = input.nextInt();
            list[i][2] = input.nextInt();
        }

        for(int i = 2; i <= n; ++i) {
            list[i][0] += Math.min(list[i-1][1], list[i-1][2]);
            list[i][1] += Math.min(list[i-1][0], list[i-1][2]);
            list[i][2] += Math.min(list[i-1][0], list[i-1][1]);
        }

        System.out.println(Math.min(list[n][0], Math.min(list[n][1], list[n][2])));

    }
}
