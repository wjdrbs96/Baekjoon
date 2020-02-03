package Baekjoon.Java.BOJ1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1012 {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int[][] adj;
    static int M;
    static int N;
    static int count;

    public static void DFS(int x, int y) {
        adj[x][y] = 0;

        for (int i = 0; i < 4; ++i) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < N && ny >= 0 && ny < M) {
                if (adj[nx][ny] == 1) {
                    DFS(nx, ny);
                }
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; ++i) {
            String[] str = br.readLine().split(" ");
            M = Integer.parseInt(str[0]);
            N = Integer.parseInt(str[1]);
            int K = Integer.parseInt(str[2]);
            adj = new int[N][M];

            for (int j = 0; j < K; ++j) {
                str = br.readLine().split(" ");
                adj[Integer.parseInt(str[1])][Integer.parseInt(str[0])] = 1;
            }

            count = 0;
            for (int p = 0; p < N; ++p) {
                for (int q = 0; q < M; ++q) {
                    if (adj[p][q] == 1) {
                        count++;
                        DFS(p, q);
                    }
                }
            }
            System.out.println(count);

        }
    }
}
