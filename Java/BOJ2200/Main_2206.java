package Baekjoon.Java.BOJ2200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * created by jg 2021/04/19
 */
public class Main_2206 {
    private static int N, M;
    private static int[][] adj;
    private static boolean[][] visit;
    private static int[] dx = {1, -1, 0, 0};
    private static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        adj = new int[N + 1][M + 1];
        visit = new boolean[N + 1][M + 1];

        for (int i = 1; i < N + 1; ++i) {
            String s = br.readLine();
            for (int j = 1; j < M + 1; ++j) {
                adj[i][j] = s.charAt(j - 1) - '0';
            }
        }

        int count = bfs(new Location(1, 1, 1, 1));

        System.out.println(count);
    }

    private static int bfs(Location location) {
        Queue<Location> queue = new LinkedList<>();
        queue.add(location);
        visit[1][1] = true;

        while (!queue.isEmpty()) {
            Location l = queue.poll();

            if (l.x == N && l.y == M) {
                return l.count;
            }

            for (int i = 0; i < 4; ++i) {
                int nx = dx[i] + l.x;
                int ny = dy[i] + l.y;
                System.out.println(nx + " " + ny + " " + l.breakCount + " " + l.count);

                if (nx > 0 && nx < N + 1 && ny > 0 && ny < M + 1) {
                    if (!visit[nx][ny]) {
                        if (adj[nx][ny] == 0) { // 이동할 수 있음
                            queue.add(new Location(nx, ny, l.count + 1, l.breakCount));
                        } else if (adj[nx][ny] == 1) {  // 벽이라면
                            if (l.breakCount > 0) {
                                queue.add(new Location(nx, ny, l.count + 1, l.breakCount - 1));
                            }
                        }

                        visit[nx][ny] = true;
                    }
                }
            }
        }

        return -1;
    }
}

class Location {
    int x;
    int y;
    int count;
    int breakCount;

    public Location(int x, int y, int count, int breakCount) {
        this.x = x;
        this.y = y;
        this.count = count;
        this.breakCount = breakCount;
    }
}