package Baekjoon.Java.BOJ2200;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_2206 {
    static int N;
    static int M;
    static int[][] adj;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void bfs(int x, int y, int count) {
        Queue<Save> q = new LinkedList<>();
        q.offer(new Save(x, y, count));

        while (!q.isEmpty()) {
            Save s = q.poll();

            if (s.x == N && s.y == M) {
                break;
            }

            for (int i = 0; i < 4; ++i) {
                int nx = s.x + dx[i];
                int ny = s.y + dy[i];

                if (nx >= 1 && nx <= N && ny >= 1 && ny <= M && adj[nx][ny] == 0) {
                    q.add(new Save(nx, ny, count));
                    adj[nx][ny] = adj[s.x][s.y] + 1;
                }

                else if (nx >= 1 && nx <= N && ny >= 1 && ny <= M && adj[nx][ny] == 1 && s.count == 0) {
                    q.add(new Save(nx, ny, 1));
                    adj[nx][ny] = adj[s.x][s.y] + 1;
                }

            }
        }
        System.out.println(adj[N][M]);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        N = input.nextInt();
        M = input.nextInt();

        adj = new int[N + 1][M + 1];

        for (int i = 1; i <= N; ++i) {
            String s = input.next();
            for (int j = 1; j <= M; ++j) {
                adj[i][j] = s.charAt(j - 1) - '0';
            }
        }

        bfs(1, 1, 0);

    }
}

class Save {
    int x;
    int y;
    int count;

    public Save(int x, int y, int count) {
        this.x = x;
        this.y = y;
        this.count = count;
    }
}
