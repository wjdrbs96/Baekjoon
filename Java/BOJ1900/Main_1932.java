package Baekjoon.Java.BOJ1900;

import java.util.Scanner;

public class Main_1932 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[][] dp = new int[n][n];
        int max = 0;

        dp[0][0] = input.nextInt();
        for (int i = 1; i < n; ++i) {
            for (int j = 0; j <= i; ++j) {
                dp[i][j] = input.nextInt();

                if (j == 0) {
                    dp[i][j] += dp[i- 1][j];
                }
                else if (j == i) {
                    dp[i][j] += dp[i - 1][j - 1];
                }
                else {
                    dp[i][j] += Math.max(dp[i - 1][j - 1], dp[i - 1][j]);
                }

                max = Math.max(max, dp[i][j]);
            }
        }
        System.out.println(max);



    }
}
