package Baekjoon.Java.BOJ7500;

import java.util.Scanner;

public class Main_7568 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[][] save = new int[n][2];   // 키, 몸무게
        int[] rank = new int[n];

        for (int i = 0; i < n; ++i) {
            rank[i] = 1;
            save[i][0] = input.nextInt();
            save[i][1] = input.nextInt();
        }

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (save[i][0] > save[j][0] && save[i][1] > save[j][1]) {
                    rank[j]++;
                }
            }
        }

        for (int i = 0; i < n; ++i) {
            System.out.print(rank[i] + " ");
        }
    }
}