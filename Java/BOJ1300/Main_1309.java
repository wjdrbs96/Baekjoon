package Baekjoon.Java.BOJ1300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * created by Gyunny 2022/01/16
 * https://www.acmicpc.net/problem/1309
 */
public class Main_1309 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] adj = new int[N + 1][3];

        Arrays.fill(adj[1], 1);
        for (int i = 2; i <= N; ++i) {
            adj[i][0] = (adj[i - 1][0] + adj[i - 1][1] + adj[i - 1][2]) % 9901;
            adj[i][1] = (adj[i - 1][0] + adj[i - 1][2]) % 9901;
            adj[i][2] = (adj[i - 1][0] + adj[i - 1][1]) % 9901;
        }

        int sum = 0;
        for (int i = 0; i < 3; ++i) {
            sum += adj[N][i];
        }

        System.out.println(sum % 9901);

    }
}
