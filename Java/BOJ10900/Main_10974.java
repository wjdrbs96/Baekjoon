package Baekjoon.Java.BOJ10900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * created by jg 2021/04/16
 */
public class Main_10974 {
    private static int N;
    private static StringBuilder sb = new StringBuilder();
    private static StringBuilder result = new StringBuilder();
    private static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        visit = new boolean[N];
        combination(0);
        System.out.println(result);
    }

    private static void combination(int depth) {
        if (depth == N) {
            result.append(sb).append("\n");
            return;
        }

        for (int i = 1; i <= N; ++i) {
            if (!visit[i - 1]) {
                sb.append(i).append(" ");
                visit[i - 1] = true;
                combination(depth + 1);
                visit[i - 1] = false;
                sb.delete(sb.length() - 2, sb.length());
            }
        }
    }
}
