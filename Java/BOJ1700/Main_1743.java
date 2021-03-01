package Baekjoon.Java.BOJ1700;

import java.util.*;

public class Main_1743 {
    static int N, M, K;
    static boolean[][] visit;
    static int adj[][];
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int count = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        N = input.nextInt(); // 세로 길이
        M = input.nextInt(); // 가로 길이
        K = input.nextInt(); // 음식물 쓰레기의 개수

        adj = new int[N + 1][M + 1];
        visit = new boolean[N + 1][M + 1];

        for (int i = 0; i < K; ++i) {
            int r = input.nextInt();
            int c = input.nextInt();
            adj[r][c] = 1;
        }

        PriorityQueue<Integer> pr = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 1; i <= N; ++i) {
            for (int j = 1; j <= M; ++j) {
                if (adj[i][j] == 1 && !visit[i][j]) {
                    dfs(i, j);
                    count++;
                    pr.add(count);
                    count = 0;
                }
            }
        }
        System.out.println(pr.poll());
    }

    static void dfs(int a, int b) {
        visit[a][b] = true;

        for (int i = 0; i < 4; ++i) {
            int nx = dx[i] + a;
            int ny = dy[i] + b;

            if (nx > 0 && nx < N + 1 && ny > 0 && ny < M + 1) {
                if (!visit[nx][ny] && adj[nx][ny] == 1) {
                    count++;
                    dfs(nx, ny);
                }
            }
        }
    }
}
