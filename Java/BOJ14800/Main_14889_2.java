package Baekjoon.Java.BOJ14800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * created by Gyunny 2022/01/31
 */
public class Main_14889_2 {
    private static int N = 0;
    private static int[][] adj;
    private static boolean[] visit;
    private static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        adj = new int[N + 1][N + 1];
        visit = new boolean[N + 1];

        for (int i = 1; i < N + 1; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j < N + 1; ++j) {
                adj[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        backTracking(0, 1);
        System.out.println(min);
    }

    private static void backTracking(int depth, int teamNo) {
        if (depth == N / 2) {
            min = Math.min(min, count());
            return;
        }

        for (int i = teamNo; i < N + 1; ++i) {
            if (!visit[i]) {
                visit[i] = true;
                backTracking(depth + 1, i + 1);
                visit[i] = false;
            }
        }
    }

    private static int count() {
        int sumA = 0;
        int sumB = 0;
        for (int i = 1; i < N + 1; ++i) {
            for (int j = 1; j < N + 1; ++j) {
                if (!visit[i] && !visit[j]) {
                    sumA += adj[i][j];
                } else if (visit[i] && visit[j]) {
                    sumB += adj[i][j];
                }
            }
        }
        return Math.abs(sumA - sumB);
    }
}