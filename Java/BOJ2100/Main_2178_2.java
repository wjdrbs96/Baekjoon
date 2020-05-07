package Baekjoon.Java.BOJ2100;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Miro {
    int x;
    int y;

    public Miro(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main_2178_2 {
    static int[][] adj;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int N;
    static int M;

    public static void bfs(int x, int y) {
        Queue<Miro> queue = new LinkedList<>();
        queue.add(new Miro(x, y));

        while (!queue.isEmpty()) {
            Miro m = queue.poll();

            for (int i = 0; i < 4; ++i) {
                int nx = m.x + dx[i];
                int ny = m.y + dy[i];

                if (1 <= nx && nx <= N && 1 <= ny && ny <= M) {
                    if (adj[nx][ny] == 1) {
                        queue.offer(new Miro(nx, ny));
                        adj[nx][ny] = adj[m.x][m.y] + 1;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        N = input.nextInt();
        M = input.nextInt();
        adj = new int[N + 1][M + 1];


        for (int i = 1; i <= N; ++i) {
            String line = input.next();
            for (int j = 0; j < line.length(); ++j) {
                adj[i][j + 1] = line.charAt(j) - '0';
            }
        }

        bfs(1, 1);
        System.out.println(adj[N][M]);

    }
}
