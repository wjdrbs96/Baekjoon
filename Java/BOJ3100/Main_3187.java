package Baekjoon.Java.BOJ3100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * created by Gyunny 2022/01/20
 * https://www.acmicpc.net/problem/3187 (Silver2)
 */
public class Main_3187 {
    private static char[][] adj;
    private static boolean[][] visit;
    private static final int[] dx = {1, -1, 0, 0};
    private static final int[] dy = {0, 0, 1, -1};
    private static int R = 0, C = 0;
    private static int SHEEP = 0, WORF = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        adj = new char[R + 1][C + 1];
        visit = new boolean[R + 1][C + 1];

        for (int i = 0; i < R; ++i) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            for (int j = 0; j < s.length(); ++j) {
                adj[i + 1][j + 1] = s.charAt(j);
            }
        }

        // . 빈공간
        // # 울타리
        // v 늑대
        // k 양
        for (int i = 1; i <= R; ++i) {
            for (int j = 1; j <= C; ++j) {
                if (!visit[i][j]) {
                    bfs(new Edge(i, j));
                }
            }
        }

        System.out.println(SHEEP + " " + WORF);

    }

    private static void bfs(Edge edge) {
        Queue<Edge> queue = new LinkedList<>();
        queue.add(edge);
        visit[edge.x][edge.y] = true;
        int wolf = 0;
        int sheep = 0;

        while (!queue.isEmpty()) {
            Edge e = queue.poll();

            for (int i = 0; i < 4; ++i) {
                int nx = dx[i] + e.x;
                int ny = dy[i] + e.y;

                if (nx > 0 && nx <= R && ny > 0 && ny <= C) {
                    if (!visit[nx][ny] && adj[nx][ny] != '#') {
                        if (adj[nx][ny] == 'v') { // 늑대라면
                            wolf++;
                        } else if (adj[nx][ny] == 'k') { // 양이라면
                            sheep++;
                        }
                        queue.add(new Edge(nx, ny));
                        visit[nx][ny] = true;
                    }
                }
            }
        }

        if (wolf >= sheep) {
            WORF += wolf;
        }
        else {
            SHEEP += sheep;
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
