package Baekjoon.Java.BOJ1400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// DP 이용
public class Main_1463_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());
        int[] dp = new int[number + 1];

        dp[0] = 0;
        dp[1] = 0;

        // D[i] = i를 1로 만들기 위해 필요한 연산 사용 횟수의 최솟값
        for (int i = 2; i <= number; ++i) {
            dp[i] = dp[i - 1] + 1;
            if (i % 2 == 0) dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            if (i % 3 == 0) dp[i] = Math.min(dp[i], dp[i / 3] + 1);
        }
        System.out.println(dp[number]);
        br.close();
    }
}
