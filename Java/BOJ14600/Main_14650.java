package Baekjoon.Java.BOJ14600;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * created by jg 2021/04/30
 */
public class Main_14650 {
    private static int N;
    private static int count = 0;
    private StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        recursion(0);
    }

    private static void recursion(int i) {
        if (i == N) {
            System.out.println(count);
            return;
        }

        for (int p = 0; p < N; ++p) {

        }
    }
}
