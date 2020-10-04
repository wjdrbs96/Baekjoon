package Baekjoon.Java.BOJ11000;

import java.util.*;

public class Main_11053 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int[] list = new int[N + 1];
        int[] dp = new int[N + 1];
        Arrays.fill(dp, 1);

        for (int i = 1; i < N + 1; ++i) {
            list[i] = input.nextInt();
        }

        for (int i = 2; i < N + 1; ++i) {
            for (int j = 1; j < i; ++j) {
                if (list[j] < list[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int max = 0;
        for (int i = 1; i < dp.length; ++i) {
            if (max < dp[i]) {
                max = dp[i];
            }
        }

        System.out.println(max);
    }
}
