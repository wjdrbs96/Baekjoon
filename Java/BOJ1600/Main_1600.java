package Baekjoon.Java.BOJ1600;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * created by Gyunny 2022/02/01
 */
public class Main_1600 {
    private static int K = 0, W = 0, H = 0;
    private static int[][] adj;
    private static boolean[][][] visit;
    private static final int[] dx = {1, -1, 0, 0};
    private static final int[] dy = {0, 0, 1, -1};
    private static final int[] mdx = {2, 2, -2, -2, 1, 1, -1, -1};
    private static final int[] mdy = {1, -1, 1, -1, 2, -2, 2, -2};
    private static boolean check = true;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        K = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        W = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        adj = new int[H + 1][W + 1];
        /**
         * 상하좌우 이동할 때랑 말처럼 이동했을 때 구분하기 위해서 3차원 배열 사용
         */
        visit = new boolean[H + 1][W + 1][K + 1];

        for (int i = 1; i < H + 1; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < W + 1; ++j) {
                adj[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Queue<Edge> queue = new LinkedList<>();
        queue.add(new Edge(1, 1, 0, K));
        visit[1][1][K] = true;

        while (!queue.isEmpty()) {
            Edge e = queue.poll();

            if (e.x == H && e.y == W) {
                System.out.println(e.count);
                check = false;
                return;
            }

            for (int i = 0; i < 4; ++i) {
                int nx = dx[i] + e.x;
                int ny = dy[i] + e.y;

                if (nx > 0 && nx < H + 1 && ny > 0 && ny < W + 1) {
                    if (!visit[nx][ny][e.k] && adj[nx][ny] == 0) {
                        queue.add(new Edge(nx, ny, e.count + 1, e.k));
                        visit[nx][ny][e.k] = true;
                    }

                }
            }

            if (e.k > 0) {
                for (int j = 0; j < 8; ++j) {
                    int mnx = mdx[j] + e.x;
                    int mny = mdy[j] + e.y;

                    if (mnx > 0 && mnx < H + 1 && mny > 0 && mny < W + 1) {
                        if (!visit[mnx][mny][e.k - 1] && adj[mnx][mny] == 0) {
                            queue.add(new Edge(mnx, mny, e.count + 1, e.k - 1));
                            visit[mnx][mny][e.k - 1] = true;
                        }
                    }
                }
            }
        }

        if (check) {
            System.out.println("-1");
        }

    }
}

class Edge {
    int x;
    int y;
    int count;
    int k;

    public Edge(int x, int y, int count, int k) {
        this.x = x;
        this.y = y;
        this.count = count;
        this.k = k;
    }
}