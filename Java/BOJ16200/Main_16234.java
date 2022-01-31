package Baekjoon.Java.BOJ16200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * created by Gyunny 2022/01/29
 */
public class Main_16234 {
    private static int N = 0, L = 0, R = 0;
    private static int[][] adj;
    private static boolean[][] visit;
    private static final int[] nx = {1, -1, 0, 0};
    private static final int[] ny = {0, 0, 1, -1};
    private static List<Edge> unite;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        adj = new int[N + 1][N + 1];

        for (int i = 0; i < N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; ++j) {
                adj[i + 1][j + 1] = Integer.parseInt(st.nextToken());
            }
        }

        int count = 0;
        while (true) {
            visit = new boolean[N + 1][N + 1];
            boolean check = false;

            for (int i = 1; i < N + 1; ++i) {
                for (int j = 1; j < N + 1; ++j) {
                    if (!visit[i][j]) {
                        int sum = bfs(new Edge(i, j));
                        if (unite.size() > 1) {
                            changeValue(sum);
                            check = true;
                        }
                    }
                }
            }
            if (!check) {
                System.out.println(count);
                return;
            }
            count++;
        }
    }

    private static int bfs(Edge edge) {
        unite = new ArrayList<>();
        Queue<Edge> queue = new LinkedList<>();
        queue.add(edge);
        unite.add(edge);
        visit[edge.x][edge.y] = true;
        int sum = adj[edge.x][edge.y];

        while (!queue.isEmpty()) {
            Edge e = queue.poll();
            for (int i = 0; i < 4; ++i) {
                int dx = e.x + nx[i];
                int dy = e.y + ny[i];

                if (dx > 0 && dx < N + 1 && dy > 0 && dy < N + 1) {
                    int sub = Math.abs(adj[dx][dy] - adj[e.x][e.y]);
                    if (!visit[dx][dy] && (sub >= L && sub <= R)) {
                        sum += adj[dx][dy];
                        queue.add(new Edge(dx, dy));
                        unite.add(new Edge(dx, dy));
                        visit[dx][dy] = true;
                    }
                }
            }
        }

        return sum;
    }

    private static void changeValue(int sum) {
        int avg = sum / unite.size();
        for (Edge e : unite) {
            adj[e.x][e.y] = avg;
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
