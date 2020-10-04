package Baekjoon.Java.BOJ12800;

import java.util.Scanner;

public class Main_12865 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();  // 물품의 수
        int K = input.nextInt();  // 버틸 수 있는 무게
        int[][] dp = new int[N + 1][K + 1];

        for (int i = 1; i < N + 1; ++i) {
            int W = input.nextInt();  // 각 물건의 무게
            int V = input.nextInt();  // 물건의 가치
            for (int j = 1; j < K + 1; ++j) {
                if (j < W) {
                    dp[i][j] = dp[i - 1][j];
                }
                else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - W] + V);
                }
            }
        }

        System.out.println(dp[N][K]);

    }
}


