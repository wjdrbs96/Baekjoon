package Baekjoon.Java.BOJ2100;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_2178_T {
    static int N, M;
    static int[][] adj;
    static boolean[][] visit;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        N = input.nextInt();
        M = input.nextInt();
        adj = new int[N + 1][M + 1];
        visit = new boolean[N + 1][M + 1];

        for (int i = 1; i < N + 1; ++i) {
            String line = input.next();
            for (int j = 1; j < M + 1; ++j) {
                adj[i][j] = (int) line.charAt(j - 1) - 48;
            }
        }

        for (int i = 1; i < N + 1; ++i) {
            for (int j = 1; j < M + 1; ++j) {
                if (!visit[i][j] && adj[i][j] == 1) {
                    bfs(i, j);
                }
            }
        }

        System.out.println(adj[N][M]);
    }

    static void bfs(int a, int b) {
        visit[a][b] = true;
        Queue<Location> queue = new LinkedList<>();
        queue.offer(new Location(a, b));

        while (!queue.isEmpty()) {
            Location poll = queue.poll();

            for (int i = 0; i < 4; ++i) {
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];

                if (nx > 0 && nx < N + 1 && ny > 0 && ny < M + 1) {
                    if (adj[nx][ny] == 1 && !visit[nx][ny]) {
                        queue.offer(new Location(nx, ny));
                        adj[nx][ny] = adj[poll.x][poll.y] + 1;
                        visit[nx][ny] = true;
                    }
                }
            }
        }
    }
}

class Location {
    int x;
    int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
