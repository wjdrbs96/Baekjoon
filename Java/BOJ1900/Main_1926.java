package Baekjoon.Java.BOJ1900;

import java.util.*;

public class Main_1926 {
    static int N;
    static int M;
    static int[][] adj;
    static boolean[][] visit;
    static int count = 0;     // 그림 개수
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        N = input.nextInt();   // 세로 크기
        M = input.nextInt();   // 가로 크기

        adj = new int[N + 1][M + 1];
        visit = new boolean[N + 1][M + 1];

        for (int i = 1; i < N + 1; ++i) {
            for (int j = 1; j < M + 1; ++j) {
                adj[i][j] = input.nextInt();
            }
        }

        int max = 0;
        for (int i = 1; i < N + 1; ++i) {
            for (int j = 1; j < M + 1; ++j) {
                if (!visit[i][j] && adj[i][j] == 1) {
                    count++;
                    max = Math.max(max, bfs(new Pair(i, j)));
                }
            }
        }


        System.out.println(count);
        System.out.println(max);
    }

    static int bfs(Pair pair) {
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(pair);
        visit[pair.x][pair.y] = true;
        int tmp = 1;

        while (!queue.isEmpty()) {
            Pair pair1 = queue.poll();
            int x = pair1.x;
            int y = pair1.y;

            for (int i = 0; i < 4; ++i) {
                int x1 = dx[i] + x;
                int y1 = dy[i] + y;

                if (x1 > 0 && x1 < N + 1 && y1 > 0 && y1 < M + 1) {
                    if (!visit[x1][y1] && adj[x1][y1] >= 1) {
                        queue.offer(new Pair(x1, y1));
                        visit[x1][y1] = true;
                        tmp++;
                    }
                }
            }
        }
        return tmp;
    }
}

class Pair {
    int x;
    int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
