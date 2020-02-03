package Baekjoon.Java.BOJ2100;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Save {
    int x;
    int y;

    public Save(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main_2178 {
    static int N;
    static int M;
    static int[][] adj;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static boolean[][] visited;


    public static void BFS(int x, int y) {
        Queue<Save> q = new LinkedList();
        q.add(new Save(x, y));

        while (!q.isEmpty()) {
            Save s = q.poll();

            for (int i = 0; i < 4; ++i) {
                int nx = s.x + dx[i];
                int ny = s.y + dy[i];

                if (nx >= 1 && nx <= N && ny >= 1 && ny <= M) {
                    if (adj[nx][ny] == 1 && !visited[nx][ny]) {
                        q.add(new Save(nx, ny));
                        adj[nx][ny] = adj[s.x][s.y] + 1;
                        visited[nx][ny] = true;
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
        visited = new boolean[N + 1][M + 1];

        for (int i = 1; i <= N; ++i) {
            String s = input.next();
            for (int j = 1; j <= M; ++j) {
                adj[i][j] = s.charAt(j - 1) - '0';
            }
        }

        BFS(1, 1);
        System.out.println(adj[N][M]);






    }
}
