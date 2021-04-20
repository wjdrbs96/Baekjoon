package Baekjoon.Java.BOJ2400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * created by jg 2021/04/20
 */
public class Main_2468 {
    private static int N;
    private static int[][] adj;
    private static boolean[][] visit;
    private static int[] nx = {1, -1, 0, 0};
    private static int[] ny = {0, 0, 1, -1};
    private static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        adj = new int[N + 1][N + 1];
        visit = new boolean[N + 1][N + 1];

        int arrMax = 0;
        for (int i = 1; i < N + 1; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j < N + 1; ++j) {
                int a = Integer.parseInt(st.nextToken());
                arrMax = Math.max(arrMax, a);
                adj[i][j] = a;
            }
        }

        for (int k = 0; k <= arrMax; ++k) {
            int count = 0;

            // 안전 영역 체크하기
            for (int i = 1; i < N + 1; ++i) {
                for (int j = 1; j < N + 1; ++j) {
                    if (!visit[i][j] && adj[i][j] > k) {
                        bfs1(new Location(i, j), k);
                        count++;
                    }
                }
            }

            max = Math.max(max, count);
            for (int a = 1; a < N + 1; ++a) {
                for (int b = 1; b < N + 1; ++b) {
                    visit[a][b] = false;
                }
            }
        }

        System.out.println(max);
    }


    private static void bfs1(Location location, int height) {
        Queue<Location> queue = new LinkedList<>();
        queue.add(location);

        while (!queue.isEmpty()) {
            Location l = queue.poll();

            for (int i = 0; i < 4; ++i) {
                int ax = nx[i] + l.x;
                int ay = ny[i] + l.y;

                if (ax > 0 && ax < N + 1 && ay > 0 && ay < N + 1) {
                    if (!visit[ax][ay] && adj[ax][ay] > height) {
                        queue.add(new Location(ax, ay));
                        visit[ax][ay] = true;
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