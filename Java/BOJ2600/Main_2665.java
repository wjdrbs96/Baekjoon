package Baekjoon.Java.BOJ2600;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main_2665 {
    static int N;
    static int[][] adj;
    static int[][] dist;
    static boolean[][] visit;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        N = input.nextInt();  // 방의 수
        adj = new int[N + 1][N + 1];
        visit = new boolean[N + 1][N + 1];
        dist = new int[N + 1][N + 1];


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
        visit[miro.x][miro.y] = true;
        deque.addLast(miro);

        while (!deque.isEmpty()) {
            Miro miro1 = deque.pollLast();
            int x = miro1.x;
            int y = miro1.y;

            for (int i = 0; i < 4; ++i) {
                int nx = dx[i] + x;
                int ny = dy[i] + y;

                if (nx > 0 && nx < N + 1 && ny > 0 && ny < N + 1 && !visit[nx][ny]) {
                    if (adj[nx][ny] == 1) {
                        deque.addLast(new Miro(nx, ny));
                        dist[nx][ny] = dist[x][y];
                    } else {
                        deque.addFirst(new Miro(nx, ny));
                        dist[nx][ny] = dist[x][y] + 1;
                    }
                    visit[nx][ny] = true;
                }
            }
        }
        System.out.println(dist[N][N]);
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
