package Baekjoon.Java.BOJ15600;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * created by jg 2021/04/13
 */
public class Main_15650_2 {
    private static int N, M;
    private static int[] adj;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        adj = new int[M];

        combination(1, 0);
        System.out.println(sb.toString());
    }

    private static void combination(int start, int depth) {
        if (depth == M) {
            for (int val : adj) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i <= N; ++i) {
            adj[depth] = i;
            combination(i + 1, depth + 1);
        }
    }
}
