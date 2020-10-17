package Baekjoon.Java.BOJ11000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_11057 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[10];
        int result = 0;

        Arrays.fill(dp, 1);

        for (int i = 1; i < N; ++i) {
            result = 0;
            for (int j = 1; j < 10; ++j) {
                dp[j] = (dp[j] + dp[j - 1]) % 10007;
                result = (result + dp[j]) % 10007;
            }
        }

        if (result == 0) {
            System.out.println(10);
        } else {
            System.out.println((result + 1) % 10007);
        }
    }
}
