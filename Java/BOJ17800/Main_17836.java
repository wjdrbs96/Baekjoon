package Baekjoon.Java.BOJ17800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * created by Gyunny 2022/02/01
 */
public class Main_17836 {
    private static int N = 0, M = 0, T = 0;
    private static int[][] adj;
    private static boolean[][][] visit;
    private static final int[] dx = {1, -1, 0, 0};
    private static final int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());

        adj = new int[N + 1][M + 1];
        visit = new boolean[N + 1][M + 1][2];

        for (int i = 1; i < N + 1; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < M + 1; ++j) {
                adj[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Queue<Edge> queue = new LinkedList<>();
        queue.add(new Edge(1, 1, 0, false));
        visit[1][1][0] = true;
        boolean check = false;

        while (!queue.isEmpty()) {
            Edge e = queue.poll();

            if (e.count > T) {
                break;
            }

            if (e.x == N && e.y == M) {
                System.out.println(e.count);
                check = true;
                break;
            }

            for (int i = 0; i < 4; ++i) {
                int nx = dx[i] + e.x;
                int ny = dy[i] + e.y;

                if (nx > 0 && nx < N + 1 && ny > 0 && ny < M + 1) {
                    if (!e.isGram) {
                        if (!visit[nx][ny][0] && adj[nx][ny] == 0) {
                            queue.add(new Edge(nx, ny, e.count + 1, false));
                            visit[nx][ny][0] = true;
                        } else if (!visit[nx][ny][0] && adj[nx][ny] == 2) {
                            queue.add(new Edge(nx, ny, e.count + 1, true));
                            visit[nx][ny][1] = true;
                        }
                    } else { // 그람이 있을 때
                        if (!visit[nx][ny][1]) {
                            queue.add(new Edge(nx, ny, e.count + 1, true));
                            visit[nx][ny][1] = true;
                        }
                    }
                }
            }
        }

        if (!check) {
            System.out.println("Fail");
        }
    }
}

class Edge {
    int x;
    int y;
    int count;
    boolean isGram;

    public Edge(int x, int y, int count, boolean isGram) {
        this.x = x;
        this.y = y;
        this.count = count;
        this.isGram = isGram;
    }
}