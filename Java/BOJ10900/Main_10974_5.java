package Baekjoon.Java.BOJ10900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * created by Gyunny 2022/01/12
 */
public class Main_10974_5 {
    private static int N;
    private static boolean[] visit;
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        visit = new boolean[N + 1];
        dfs(0);
    }

    private static void dfs(int depth) {
        if (depth == N) {
            System.out.println(sb);
            return;
        }

        for (int i = 1; i <= N; ++i) {
            if (!visit[i]) {
                sb.append(i).append(" ");
                visit[i] = true;
                dfs(depth + 1);
                visit[i] = false;
                sb.delete(sb.length() - 2, sb.length());
            }
        }
    }
}
