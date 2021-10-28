package Baekjoon.Java.BOJ1100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * created by Gyunny 2021/10/28
 */
public class Main_1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int result = N;
        int count = 0;

        while (true) {
            int a = result / 10;  // 십의 자리 수
            int b = result % 10;  // 일의 자리 수

            int c = (a + b) % 10;
            result = b * 10 + c;
            count++;

            if (result == N) break;
        }

        System.out.println(count);
    }
}
