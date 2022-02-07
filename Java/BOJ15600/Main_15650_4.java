package Baekjoon.Java.BOJ15600;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * created by Gyunny 2022/02/07
 */
public class Main_15650_4 {
    private static int N = 0, M = 0;
    private static StringBuilder sb = new StringBuilder();
    private static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visit = new boolean[N + 1];

        backTracking(0, 1);
    }

    private static void backTracking(int depth, int order) {
        if (depth == M) {
            System.out.println(sb);
            return;
        }

        for (int i = order; i <= N; ++i) {
            sb.append(i).append(" ");
            backTracking(depth + 1, i + 1);
            sb.delete(sb.length() - 2, sb.length());
        }
    }
}
