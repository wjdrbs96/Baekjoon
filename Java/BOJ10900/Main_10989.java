package Baekjoon.Java.BOJ10900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * created by Gyunny 2021/11/02
 */
public class Main_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] list = new int[N];

        for (int i = 0; i < N; ++i) {
            list[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(list);
        StringBuilder sb = new StringBuilder();

        for (int a : list) {
            sb.append(a).append("\n");
        }

        System.out.println(sb);
    }
}
