package Baekjoon.Java.BOJ13500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * created by Gyunny 2022/01/31
 */
public class Main_13565 {
    private static int N = 0, M = 0;
    private static char[][] adj;
    private static boolean[][] visit;
    private static final int[] dx = {1, -1, 0, 0};
    private static final int[] dy = {0, 0, 1, -1};
    private static boolean check = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        adj = new char[N + 1][M + 1];

        for (int i = 1; i < N + 1; ++i) {
            String s = br.readLine();
            for (int j = 1; j < M + 1; ++j) {
                adj[i][j] = s.charAt(j - 1);
            }
        }

        for (int i = 1; i < M + 1; ++i) {
            visit = new boolean[N + 1][M + 1];
            if (!visit[1][i] && adj[1][i] == '0') {
                dfs(new Edge(1, i));
            }
            if (check) break;
        }

        if (check) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static void dfs(Edge edge) {
        visit[edge.x][edge.y] = true;
        if (edge.x == N) {
            check = true;
            return;
        }

        for (int i = 0; i < 4; ++i) {
            int nx = edge.x + dx[i];
            int ny = edge.y + dy[i];

            if (nx > 0 && nx < N + 1 && ny > 0 && ny < M + 1) {
                if (adj[nx][ny] == '0' && !visit[nx][ny]) {
                    visit[nx][ny] = true;
                    dfs(new Edge(nx, ny));
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
