package Baekjoon.Java.BOJ1000;

import java.util.Scanner;

public class Main_1012_2 {
    static int[][] adj;
    static boolean[][] visited;
    static int N;
    static int M;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int count = 0;

    public static void edge(int start, int end) {
        adj[start][end] = 1;
    }

    public static void dfs(int start, int end) {
        visited[start][end] = true;

        for (int i = 0; i < 4; ++i) {
            int nx = dx[i] + start;
            int ny = dy[i] + end;

            if (nx >= 0 && nx < N && ny >= 0 && ny < M) {
                if (adj[nx][ny] == 1 && !visited[nx][ny]) {
                    dfs(nx, ny);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();   // 테스트케이스 수

        for (int i = 0; i < t; ++i) {
            M = input.nextInt();       // 가로 길이
            N = input.nextInt();       // 세로 길이
            int K = input.nextInt();   // 배추가 있는 위치의 수

            adj = new int[N][M];
            visited = new boolean[N][M];

            for (int j = 0; j < K; ++j) {
                int a = input.nextInt();
                int b = input.nextInt();
                edge(b, a);
            }

            count = 0;
            for (int p = 0; p < N; ++p) {
                for (int q = 0; q < M; ++q) {
                    if (!visited[p][q] && adj[p][q] == 1) {
                        count++;
                        dfs(p, q);
                    }
                }
            }

            System.out.println(count);
        }

    }
}
