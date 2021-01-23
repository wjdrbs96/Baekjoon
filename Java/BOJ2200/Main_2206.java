package Baekjoon.Java.BOJ2200;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_2206 {
    static int N, M, ans;
    static int[][] adj;
    static boolean[][] visit;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int breakCount = 1;   // 벽 부수기 1회 가능

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        N = input.nextInt();
        M = input.nextInt();

        adj = new int[N + 1][M + 1];
        visit = new boolean[N + 1][M + 1];

        for (int i = 1; i < N + 1; ++i) {
            String number = input.next();
            for (int j = 1; j < M + 1; ++j) {
                adj[i][j] = number.charAt(j - 1) - 48;
            }
        }

        ans = Integer.MAX_VALUE;
        bfs(1, 1);

        if (ans == Integer.MAX_VALUE) {
            System.out.println(-1);
        }
        else {
            System.out.println(ans);
        }
    }

    static void bfs(int a, int b) {
        visit[a][b] = true;
        Queue<Location> queue = new LinkedList<>();
        queue.offer(new Location(a, b, 1, 0));

        while (!queue.isEmpty()) {
            Location poll = queue.poll();

            if (poll.x == N && poll.y == M) {
                ans = poll.dis;
                break;
            }

            for (int i = 0; i < 4; ++i) {
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];

                if (nx > 0 && nx <= N && ny > 0 && ny <= M) {
                    if (!visit[nx][nx] && adj[nx][ny] == 0) {
                        queue.offer(new Location(nx, ny, poll.dis + 1, 0));
                        visit[nx][ny] = true;
                    }
                    // 벽일 때 한번 부수기
                    else {
                        if (poll.drill == 0) {
                            adj[nx][ny] = 0;
                            queue.offer(new Location(nx, ny, poll.dis + 1, 1));
                            visit[nx][ny] = true;
                        }
                    }
                }
            }
        }
    }
}


class Location {
    int x;
    int y;
    int dis;
    int drill;

    public Location(int x, int y, int dis, int drill) {
        this.x = x;
        this.y = y;
        this.dis = dis;
        this.drill = drill;
    }
}
