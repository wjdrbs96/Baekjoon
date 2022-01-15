package Baekjoon.Java.BOJ18400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * created by Gyunny 2022/01/14
 * https://www.acmicpc.net/problem/18428
 */
public class Main_18428 {
    private static int N;
    private static String[][] adj;
    private static final int[] dx = {1, -1, 0, 0};
    private static final int[] dy = {0, 0, 1, -1};
    private static boolean[][] visit;
    private static int count = 3;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        adj = new String[N][N];
        visit = new boolean[N][N];

        // 완전 탐색, dfs
        for (int i = 0; i < N; ++i) {
            String input = br.readLine();
            adj[i] = input.split(" ");
        }

        boolean check = true;
        out:for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                if (adj[i][j].equals("S")) {
                    check = dfs(new Edge(i, j, adj[i][j]));
                    if (!check) {
                        break out;
                    }
                    initVisit();
                }
            }
        }

        if (check) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean dfs(Edge edge) {
        visit[edge.x][edge.y] = true;

        for (int i = 0; i < 4; ++i) {
            int nx = dx[i] + edge.x;
            int ny = dy[i] + edge.y;

            if (nx >= 0 && nx < N && ny >= 0 && ny < N) {
                String before = edge.beforeCh;
                if (before.equals("S") && !visit[nx][ny] && adj[nx][ny].equals("T")) {
                    return false;
                }

                if (before.equals("X") && !visit[nx][ny] && adj[nx][ny].equals("T")) {
                    if (count > 0) {
                        count -= 1;
                        return true;
                    }

                    return false;
                }

                if (!visit[nx][ny] && !adj[nx][ny].equals("T")) {
                    dfs(new Edge(nx, ny, adj[nx][ny]));
                }
            }
        }

        return true;
    }

    private static void initVisit() {
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                visit[i][j] = false;
            }
        }
    }
}

class Edge {
    int x;
    int y;
    String beforeCh;

    public Edge(int x, int y, String beforeCh) {
        this.x = x;
        this.y = y;
        this.beforeCh = beforeCh;
    }
}
