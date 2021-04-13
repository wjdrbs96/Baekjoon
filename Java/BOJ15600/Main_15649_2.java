package Baekjoon.Java.BOJ15600;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * created by jg 2021/04/13
 */
public class Main_15649_2 {
    private static int N, M;
    private static boolean[] visit;
    private static int[] adj;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 1; ++i) {
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
        }

        adj = new int[M + 1];
        visit = new boolean[N + 1];
        combination(0);
    }

    private static void combination(int depth) {
        if (depth == M) {
            for (int i = 1; i < adj.length; ++i) {
                System.out.print(adj[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i < N + 1; ++i) {
            if (!visit[i]) {
                adj[depth + 1] = i;
                visit[i] = true;
                combination(depth + 1);
                visit[i] = false;
            }
        }
    }
}
