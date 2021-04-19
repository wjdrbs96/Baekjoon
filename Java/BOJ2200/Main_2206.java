package Baekjoon.Java.BOJ2200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
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
    private static int count = 0;
    private static int[] nx = {1, -1, 0, 0};
    private static int[] ny = {0, 0, 1, -1};

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

        bfs(new Location(0, 0));
    }

    private static void bfs(Location location) {
        visit[location.x][location.y] = true;
        Queue<Location> queue = new LinkedList<>();
        queue.add(location);

        while (!queue.isEmpty()) {
            Location l = queue.poll();

            if (l.x == N && l.y == M) {
                if (count == 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(count);
                }
                break;
            }

            for (int i = 0; i < 4; ++i) {
                int ax = nx[i] + l.x;
                int ay = ny[i] + l.y;

                if (ax > 0 && ax < N + 1 && ay > 0 && ay < M + 1) {
                    if (adj[ax][ay] == 0 && !visit[ax][ay]) {
                        queue.add(new Location(ax, ay));
                    } else if (adj[ax][ay] == 1 && !visit[ax][ay]) {

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
