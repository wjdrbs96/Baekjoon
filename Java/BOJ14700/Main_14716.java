package Baekjoon.Java.BOJ14700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * created by jg 2021/04/20
 */
public class Main_14716 {
    private static int M, N;
    private static int[][] adj;
    private static boolean[][] visit;
    private static int count = 0;
    private static int[] nx = {1, - 1, 0, 0, 1, 1, -1, -1};
    private static int[] ny = {0, 0, 1, -1, 1, -1, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        adj = new int[M + 1][N + 1];
        visit = new boolean[M + 1][N + 1];

        for (int i = 1; i < M + 1; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < N + 1; ++j) {
                adj[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 1; i < M + 1; ++i) {
            for (int j = 1; j < N + 1; ++j) {
                if (!visit[i][j] && adj[i][j] == 1) {
                    bfs(new Save(i, j));
                    count++;
                }
            }
        }

        System.out.println(count);

    }

    private static void bfs(Save save) {
        Queue<Save> queue = new LinkedList<>();
        queue.add(save);

        while (!queue.isEmpty()) {
            Save s = queue.poll();

            for (int i = 0; i < 8; ++i) {
                int ax = s.x + nx[i];
                int ay = s.y + ny[i];

                if (ax > 0 && ax < M + 1 && ay > 0 && ay < N + 1) {
                    if (adj[ax][ay] == 1 && !visit[ax][ay]) {
                        queue.add(new Save(ax, ay));
                        visit[ax][ay] = true;
                    }
                }
            }
        }
    }
}

class Save {
    int x;
    int y;

    public Save(int x, int y) {
        this.x = x;
        this.y = y;
    }
}