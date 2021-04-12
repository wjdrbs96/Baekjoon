package Baekjoon.Java.BOJ14800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * created by jg 2021/04/12
 */
public class Main_14889 {
    private static int N;
    private static int[][] adj;
    private static boolean[] visited;
    private static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        adj = new int[N + 1][N + 1];
        visited = new boolean[N + 1];

        for (int i = 1 ; i < N + 1; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j < N + 1; ++j) {
                adj[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(1, 0);
        System.out.println(min);
    }

    private static void dfs(int start, int depth) {
        if (depth == N / 2) {
            min = Math.min(min, count());
        }

        for (int i = start; i < N + 1; ++i) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(i + 1, depth + 1);
                visited[i] = false;
            }
        }
    }

    private static int count() {
        int sumStart = 0;
        int sumLink = 0;

        for (int i = 1; i < N + 1; ++i) {
            for (int j = 1; j < N + 1; ++j) {
                if (visited[i] && visited[j]) {
                    sumStart += adj[i][j];
                }

                if (!visited[i] && !visited[j]) {
                    sumLink += adj[i][j];
                }
            }
        }

        return Math.abs(sumStart - sumLink);
    }
}
