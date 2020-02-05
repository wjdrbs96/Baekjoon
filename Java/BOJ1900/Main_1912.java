package Baekjoon.Java.BOJ1900;

import java.util.Scanner;

public class Main_1912 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] dp = new int[n];       // 더한 것을 저장하는 배열
        int[] ary = new int[n];      // 입력 받은 것을 저장

        for (int i = 0; i < n; ++i) {
            ary[i] = input.nextInt();
        }

        dp[0] = ary[0];
        int max = ary[0];
        for (int i = 1; i < n; ++i) {
            dp[i] = Math.max(dp[i - 1] + ary[i], ary[i]);   // 2개 더한 것과 다음 것의 max
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);


    }
}
