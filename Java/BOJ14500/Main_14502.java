package Baekjoon.Java.BOJ14500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * created by Gyunny 2022/01/24
 */
public class Main_14502 {
    private static int N = 0, M = 0;
    private static int[][] adj;
    private static int[][] copy;
    private static int[] dx = {1, -1, 0, 0};
    private static int[] dy = {0, 0, 1, -1};
    private static int maxCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        adj = new int[N + 1][M + 1];
        copy = new int[N + 1][M + 1];

        for (int i = 1; i < N + 1; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < M + 1; ++j) {
                adj[i][j] = Integer.parseInt(st.nextToken());
                copy[i][j] = adj[i][j];
            }
        }

        dfs(0);
        System.out.println(maxCount);
    }

    private static void dfs(int depth) {
        if (depth == 3) {
            bfs();
            maxCount = Math.max(maxCount, calculate());
            return;
        }

        for (int i = 1; i < N + 1; ++i) {
            for (int j = 1; j < M + 1; ++j) {
                if (copy[i][j] == 0) {
                    copy[i][j] = 1;
                    dfs(depth + 1);
                    copy[i][j] = 0;
                }
            }
        }
    }

    private static void bfs() {
        Queue<Edge> queue = new LinkedList<>();
        for (int i = 1; i < N + 1; ++i) {
            for (int j = 1; j < M + 1; ++j) {
                adj[i][j] = copy[i][j];
            }
        }

        for (int i = 1; i < N + 1; ++i) {
            for (int j = 1; j < M + 1; ++j) {
                if (adj[i][j] == 2) {
                    queue.add(new Edge(i, j));
                }
            }
        }

        while (!queue.isEmpty()) {
            Edge e = queue.poll();

            for (int i = 0; i < 4; ++i) {
                int nx = dx[i] + e.x;
                int ny = dy[i] + e.y;

                if (nx > 0 && nx < N + 1 && ny > 0 && ny < M + 1) {
                    if (adj[nx][ny] == 0) {
                        adj[nx][ny] = 2;
                        queue.add(new Edge(nx, ny));
                    }
                }
            }
        }
    }

    private static int calculate() {
        int count = 0;
        for (int i = 1; i < N + 1; ++i) {
            for (int j = 1; j < M + 1; ++j) {
                if (adj[i][j] == 0) {
                    count++;
                }
            }
        }

        return count;
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
