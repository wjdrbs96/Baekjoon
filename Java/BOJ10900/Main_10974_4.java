package Baekjoon.Java.BOJ10900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * created by Gyunny 2021/11/02
 */
public class Main_10974_4 {
    private static int N;
    private static boolean[] visit;
    private static StringBuilder sb = new StringBuilder();
    private static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        visit = new boolean[N + 1];

        combination(0);
        System.out.println(result);
    }

    private static void combination(int depth) {
        if (depth == N) {
            result.append(sb).append("\n");
            return;
        }

        for (int i = 1; i <= N; ++i) {
            if (!visit[i]) {
                sb.append(i).append(" ");
                visit[i] = true;
                combination(depth + 1);
                visit[i] = false;
                sb.delete(sb.length() - 2, sb.length());
            }
        }
    }
}
