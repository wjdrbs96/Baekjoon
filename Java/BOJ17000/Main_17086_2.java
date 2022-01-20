package Baekjoon.Java.BOJ17000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * created by Gyunny 2022/01/20
 * 왜 안됨?
 */
public class Main_17086_2 {
    private static int N = 0, M = 0;
    private static int[][] adj;
    private static boolean[][] visit;
    private static int[] nx = {1, -1, 0, 0, 1, -1, 1, -1};
    private static int[] ny = {0, 0, 1, -1, 1, -1, -1, 1};
    private static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        adj = new int[N + 1][M + 1];
        visit = new boolean[N + 1 ][M + 1];

        for (int i = 1; i < N + 1; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < M + 1; ++j) {
                adj[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 1; i < N + 1; ++i) {
            for (int j = 1; j < M + 1; ++j) {
                if (adj[i][j] == 1) {
                    bfs(new Edge(i, j, 0));
                    for (int a = 1; a < N + 1; ++a) {
                        for (int b = 1; b < M + 1; ++b) {
                            System.out.print(adj[a][b] + " ");
                        }
                        System.out.println();
                    }
                }
                System.out.println("=====");
                initVisit();
            }
        }

        int max = 0;
        for (int i = 1; i < N + 1; ++i) {
            for (int j = 1; j < M + 1; ++j) {
                max = Math.max(max, adj[i][j]);
            }
        }

        System.out.println(max / 2);
    }

    private static void bfs(Edge edge) {
        visit[edge.x][edge.y] = true;
        Queue<Edge> queue = new LinkedList<>();
        queue.add(edge);
        count++;

        while (!queue.isEmpty()) {
            Edge e = queue.poll();

            for (int i = 0; i < 8; ++i) {
                int ax = nx[i] + e.x;
                int ay = ny[i] + e.y;

                if (ax > 0 && ax < N + 1 && ay > 0 && ay < M + 1) {
                    if (!visit[ax][ay] && adj[ax][ay] != 1) {
                        if (count == 1) {
                            int max = Math.max(e.count + 2, adj[ax][ay]);
                            adj[ax][ay] = max;
                            queue.add(new Edge(ax, ay, max));
                        } else {
                            int min = Math.min(e.count + 2, adj[ax][ay]);
                            adj[ax][ay] = min;
                            queue.add(new Edge(ax, ay, min));
                        }
                        visit[ax][ay] = true;
                    }
                }
            }
        }
    }

    private static void initVisit() {
        for (int i = 1; i < N + 1; ++i) {
            for (int j = 1; j < M + 1; ++j) {
                visit[i][j] = false;
            }
        }
    }
}

class Edge {
    int x;
    int y;
    int count;

    public Edge(int x, int y, int count) {
        this.x = x;
        this.y = y;
        this.count = count;
    }
}
