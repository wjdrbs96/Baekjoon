package Baekjoon.Java.BOJ2100;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_2178_3 {
    static int N;
    static int M;
    static int[][] adj;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    static void bfs() {
        Queue<MiroTest> queue = new LinkedList<>();
        queue.offer(new MiroTest(1, 1));

        while (!queue.isEmpty()) {
            MiroTest m = queue.poll();

            for (int i = 0; i < 4; ++i) {
                int nx = m.x + dx[i];
                int ny = m.y + dy[i];

                if (nx >= 1 && nx < N + 1 && ny >= 1 && ny < M + 1) {
                    if (adj[nx][ny] == 1) {
                        adj[nx][ny] = adj[m.x][m.y] + 1;
                        queue.offer(new MiroTest(nx, ny));
                    }
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

        for (int i = 1; i < N + 1; ++i) {
            int j = 1;
            String line = input.next();
            for (char ch : line.toCharArray()) {
                adj[i][j] = ch - '0';
                j++;
            }
        }

        bfs();
    }
}

class MiroTest {
    int x;
    int y;

    public MiroTest(int x, int y) {
        this.x = x;
        this.y = y;
    }
}