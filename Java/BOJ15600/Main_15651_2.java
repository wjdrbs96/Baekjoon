package Baekjoon.Java.BOJ15600;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * created by Gyunny 2022/02/07
 */
public class Main_15651_2 {
    private static int N = 0, M = 0;
    private static final StringBuilder sb = new StringBuilder();
    private static final StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        backTracking(0);
        System.out.println(result);
    }

    private static void backTracking(int depth) {
        if (depth == M) {
            result.append(sb).append("\n");
            return;
        }

        for (int i = 1; i <= N; ++i) {
            sb.append(i).append(" ");
            backTracking(depth + 1);
            sb.delete(sb.length() - 2, sb.length());
        }
    }
}
