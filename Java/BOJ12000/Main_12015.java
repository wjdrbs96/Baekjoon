package Baekjoon.Java.BOJ12000;

import java.util.Arrays;
import java.util.Scanner;

public class Main_12015 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int[] list = new int[N + 1];
        int[] dp = new int[N + 1];
        int[] dp1 = new int[N + 1];
        Arrays.fill(dp, 1);
        Arrays.fill(dp1, 1);

        for (int i = 1; i < list.length; ++i) {
            list[i] = input.nextInt();
        }

        for (int i = 2; i < N + 1; ++i) {
            for (int j = 1; j < i; ++j) {
                if (list[j] < list[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }

        }

        for (int k = N - 1; k > 0; --k) {
            for (int m = N; m > k; --m) {
                if (list[k] > list[m]) {
                    dp1[k] = Math.max(dp1[k], dp1[m] + 1);
                }
            }
        }

        for (int i = 1; i < N + 1; ++i) {
            dp[i] += dp1[i];
        }

        int max = 0;
        for (int i = 1; i < dp.length; ++i) {
            if (max < dp[i]) {
                max = dp[i];
            }
        }
        System.out.println(max - 1);
    }
}
