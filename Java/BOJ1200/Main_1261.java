package Baekjoon.Java.BOJ1200;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_1261 {
    static int N;
    static int M;
    static int[][] adj;
    static boolean[][] visit;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int count = 0;

    public static void bfs(int x, int y) {
        Queue<Miro> queue = new LinkedList<>();
        visit[x][y] = true;
        queue.offer(new Miro(x, y));

        out:while (!queue.isEmpty()) {
            Miro m = queue.poll();
            for (int i = 0; i < 4; ++i) {
                int nx = m.x + dx[i];
                int ny = m.y + dy[i];

                if (nx == M && ny == N) {
                    break out;
                }

                if (1 <= nx && nx <= M && 1 <= ny && ny <= N) {
                    if (!visit[nx][ny] && adj[nx][ny] == 0) {
                        queue.offer(new Miro(nx, ny));
                    }
                    else {
                        adj[nx][ny] = 0;
                        queue.offer(new Miro(nx, ny));
                        adj[nx][ny] = adj[m.x][m.y] + 1;
                    }
                    visit[nx][ny] = true;
                }

            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        N = input.nextInt();
        M = input.nextInt();

        adj = new int[M + 1][N + 1];
        visit = new boolean[M + 1][N + 1];

        for (int i = 0; i < M; ++i) {
            String s = input.next();
            for (int j = 0; j < s.length(); ++j) {
                adj[i][j] = s.charAt(j) - '0';
            }
        }

        bfs(1, 1);
        System.out.println(adj[M][N]);

    }
}

class Miro {
    int x;
    int y;

    public Miro(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
