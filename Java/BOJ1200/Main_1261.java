package Baekjoon.Java.BOJ1200;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main_1261 {
    static int N;
    static int M;
    static int[][] adj;
    static boolean[][] visit;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        M = input.nextInt();
        N = input.nextInt();

        adj = new int[N + 1][M + 1];
        visit = new boolean[N + 1][M + 1];

        for (int i = 1; i <= N; ++i) {
            int j = 1;
            String line = input.next();
            for (char ch : line.toCharArray()) {
                adj[i][j] = Integer.parseInt(String.valueOf(ch));
                j++;
            }
        }

        bfs(new Miro(1, 1));

    }


    static void bfs(Miro miro) {
        Deque<Miro> deque = new LinkedList<>();
        deque.addLast(miro);
        visit[miro.x][miro.y] = true;

        while (!deque.isEmpty()) {
            Miro miro1 = deque.pollLast();
            int x = miro1.x;
            int y = miro1.y;

            for (int i = 0; i < 4; ++i) {
                int nx = dx[i] + x;
                int ny = dy[i] + y;

                if (nx > 0 && nx < N + 1 && ny > 0 && ny < M + 1 && !visit[nx][ny]) {
                    if (adj[nx][ny] == 1) {
                        adj[nx][ny] = adj[x][y] + 1;
                        deque.addFirst(new Miro(nx, ny));
                    }
                    else {
                        adj[nx][ny] = adj[x][y];
                        deque.addLast(new Miro(nx, ny));
                    }
                    visit[nx][ny] = true;
                }
            }
        }

        System.out.println(adj[N][M]);
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
