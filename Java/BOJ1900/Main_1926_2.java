package Baekjoon.Java.BOJ1900;

import java.util.*;

public class Main_1926_2 {
    static int n, m;
    static int[][] adj;
    static boolean[][] visit;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int count = 0;
    static int area = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        n = input.nextInt();   // 세로 크기
        m = input.nextInt();   // 가로 크기

        adj = new int[n + 1][m + 1];
        visit = new boolean[n + 1][m + 1];

        for (int i = 1; i < n + 1; ++i) {
            for (int j = 1; j < m + 1; j++) {
                adj[i][j] = input.nextInt();
            }
        }

        PriorityQueue<Integer> pr = new PriorityQueue<>();
        for (int i = 1; i < n + 1; ++i) {
            for (int j = 1; j < m + 1; ++j) {
                if (adj[i][j] == 1 && !visit[i][j]) {
                    count++;
                    bfs(i, j);
                    pr.add(area);
                    area = 0;
                }
            }
        }

        if (count == 0) {
            System.out.println(0);
            System.out.println(0);
        } else {
            System.out.println(count);
            System.out.println(Collections.max(pr));
        }
    }

    static void bfs(int a, int b) {
        Queue<Location> queue = new LinkedList<>();
        visit[a][b] = true;
        queue.offer(new Location(a, b));

        while (!queue.isEmpty()) {
            Location poll = queue.poll();
            area++;

            for (int i = 0; i < 4; ++i) {
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];

                if (nx > 0 && nx < n + 1 && ny > 0 && ny < m + 1) {
                    if (adj[nx][ny] == 1 && !visit[nx][ny]) {
                        queue.offer(new Location(nx, ny));
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
