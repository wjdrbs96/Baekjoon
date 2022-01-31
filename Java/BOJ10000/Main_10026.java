package Baekjoon.Java.BOJ10000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * created by Gyunny 2022/01/31
 */
public class Main_10026 {
    private static int N = 0;
    private static char[][] adj;
    private static boolean[][] visit;
    private static final int[] dx = {1, -1, 0, 0};
    private static final int[] dy = {0, 0, 1, -1};
    private static int normalCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        adj = new char[N + 1][N + 1];
        visit = new boolean[N + 1][N + 1];

        for (int i = 1; i < N + 1; ++i) {
            String s = br.readLine();
            for (int j = 1; j < N + 1; ++j) {
                adj[i][j] = s.charAt(j - 1);
            }
        }

        for (int i = 1; i < N + 1; ++i) {
            for (int j = 1; j < N + 1; ++j) {
                if (!visit[i][j]) {
                    normalDfs(new Edge(i, j));
                    normalCount++;
                }
            }
        }

        visit = new boolean[N + 1][N + 1];
        for (int i = 1; i < N + 1; ++i) {
            for (int j = 1; j < N + 1; ++j) {
                if (adj[i][j] == 'G') {
                    adj[i][j] = 'R';
                }
            }
        }

        int abNormalCount = 0;
        for (int i = 1; i < N + 1; ++i) {
            for (int j = 1; j < N + 1; ++j) {
                if (!visit[i][j]) {
                    normalDfs(new Edge(i, j));
                    abNormalCount++;
                }
            }
        }

        System.out.println(normalCount + " " + abNormalCount);


    }

    private static void normalDfs(Edge edge) {
        visit[edge.x][edge.y] = true;
        char ch = adj[edge.x][edge.y];

        for (int i = 0; i < 4; ++i) {
            int nx = dx[i] + edge.x;
            int ny = dy[i] + edge.y;

            if (nx > 0 && nx < N + 1 && ny > 0 && ny < N + 1) {
                if (!visit[nx][ny] && adj[nx][ny] == ch) {
                    normalDfs(new Edge(nx, ny));
                }
            }
        }

    }
}

class Edge {
    int x;
    int y;

    public Edge(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
