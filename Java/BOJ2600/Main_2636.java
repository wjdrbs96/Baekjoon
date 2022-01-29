package Baekjoon.Java.BOJ2600;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * created by Gyunny 2022/01/29
 */
public class Main_2636 {
    private static int N = 0, M = 0;
    private static int[][] adj;
    private static boolean[][] visit;
    private static final int[] nx = {1, -1, 0, 0};
    private static final int[] ny = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        adj = new int[N + 1][M + 1];

        for (int i = 1; i < N + 1; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < M + 1; ++j) {
                adj[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int time = 0;
        int ans = 0;
        while (true) {
            visit = new boolean[N + 1][M + 1];
            Queue<Edge> queue = new LinkedList<>();
            queue.add(new Edge(1, 1));
            visit[1][1] = true;

            while (!queue.isEmpty()) {
                Edge e = queue.poll();

                for (int i = 0; i < 4; ++i) {
                    int dx = e.x + nx[i];
                    int dy = e.y + ny[i];

                    if (dx > 0 && dx < N + 1 && dy > 0 && dy < M + 1) {
                        if (!visit[dx][dy] && adj[dx][dy] == 0) {
                            queue.add(new Edge(dx, dy));
                            visit[dx][dy] = true;
                        } else if (!visit[dx][dy] && adj[dx][dy] == 1) {
                            adj[dx][dy] = 2;
                            visit[dx][dy] = true;
                        }
                    }
                }
            }

            time++;
            ans = changeTwoToZero();
            if (validateZero()) {
                break;
            }
        }

        System.out.println(time);
        System.out.println(ans);
    }

    private static int changeTwoToZero() {
        int count = 0;
        for (int i = 1; i < N + 1; ++i) {
            for (int j = 1; j < M + 1; ++j) {
                if (adj[i][j] == 2) {
                    adj[i][j] = 0;
                    count++;
                }
            }
        }

        return count;
    }

    private static boolean validateZero() {
        for (int i = 1; i < N + 1; ++i) {
            for (int j = 1; j < M + 1; ++j) {
                if (adj[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
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
