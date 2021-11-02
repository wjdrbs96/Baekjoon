package Baekjoon.Java.BOJ2700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * created by Gyunny 2021/11/01
 */
public class Main_2775_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] list = new int[15][14];
        for (int i = 0; i < 14; i++) {
            list[0][i] = i + 1; // 모든 층의 0호는 값이 1
        }

        // 미리 전부 다 값을 세팅
        for (int i = 1; i <= 14; ++i) {
            for (int j = 0; j <= 14; ++j) {

            }
        }

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; ++i) {
            int k = Integer.parseInt(br.readLine()); // 층
            int n = Integer.parseInt(br.readLine()); // 호

        }

    }
}
