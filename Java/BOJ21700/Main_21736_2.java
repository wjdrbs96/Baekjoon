package Baekjoon.Java.BOJ21700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * created by Gyunny 2022/01/26
 */
public class Main_21736_2 {
    private static int N = 0, M = 0;
    private static final int[] nx = {1, -1, 0, 0};
    private static final int[] ny = {0, 0, 1, -1};
    private static char[][] adj;
    private static boolean[][] visit;
    private static int countPeople;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        adj = new char[N + 1][M + 1];
        visit = new boolean[N + 1][M + 1];

        Queue<Edge> queue = new LinkedList<>();
        for (int i = 1; i < N + 1; ++i) {
            String s = br.readLine();
            for (int j = 1; j < M + 1; ++j) {
                adj[i][j] = s.charAt(j - 1);
                if (adj[i][j] == 'I') queue.add(new Edge(i, j));
            }
        }

        while (!queue.isEmpty()) {
            Edge e = queue.poll();
            visit[e.x][e.y] = true;

            for (int i = 0; i < 4; ++i) {
                int dx = nx[i] + e.x;
                int dy = ny[i] + e.y;

                if (dx > 0 && dx <= N && dy > 0 && dy <= M) {
                    if (!visit[dx][dy] && adj[dx][dy] != 'X') {
                        queue.add(new Edge(dx, dy));
                        visit[dx][dy] = true;
                        if (adj[dx][dy] == 'P') countPeople++;
                    }
                }
            }
        }

        if (countPeople == 0) System.out.println("TT");
        else System.out.println(countPeople);

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
