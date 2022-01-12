package Baekjoon.Java.BOJ15600;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * created by Gyunny 2022/01/09
 * https://www.acmicpc.net/problem/15649
 * visit 을 처음에 생각 못해서 조금 시간이 걸렸음
 */
public class Main_15649_3 {
    private static int N = 0, M = 0;
    private static StringBuilder sb = new StringBuilder();
    private static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visit = new boolean[N + 1];

        dfs(0);
    }

    public static void dfs(int depth) {
        if (depth == M) {
            System.out.println(sb);
            return;
        }

        for (int i = 0; i < N; ++i) {
            if (!visit[i]) {
                sb.append(i + 1).append(" ");
                visit[i] = true;
                dfs(depth + 1);
                sb.delete(sb. length() - 2, sb.length());
                visit[i] = false;
            }

        }
    }
}
