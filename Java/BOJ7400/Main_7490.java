package Baekjoon.Java.BOJ7400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * created by Gyunny 2022/01/30
 */
public class Main_7490 {
    private static int M = 0;
    private static int sum = 0;
    private static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; ++i) {
            M = Integer.parseInt(br.readLine());
            System.out.println();
            sb = new StringBuilder();
            sum = 0;
        }
    }

    private static void backTracking(int depth, String ch) {
        if (sum == 0) {
            System.out.println(sb);
            return;
        }


    }
}
