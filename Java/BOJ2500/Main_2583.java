package Baekjoon.Java.BOJ2500;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main_2583 {
    static boolean[][] visit;
    static int[][] adj;
    static int M, N, K, count;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int area;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        M = input.nextInt();   // 세로 길이
        N = input.nextInt();   // 가로 길이
        K = input.nextInt();   // 직사각형 수

        adj = new int[M][N];
        visit = new boolean[M][N];

        for (int i = 0; i < K; ++i) {
            int a = input.nextInt();   // 왼쪽 아래 x
            int b = input.nextInt();   // 왼쪽 아래 y
            int c = input.nextInt();   // 오른쪽 위 x
            int d = input.nextInt();   // 오른쪽 위 y
            settingOne(a, b, c, d);
        }

        PriorityQueue<Integer> pr = new PriorityQueue<>();
        for (int p = 0; p < adj.length; ++p) {
            for (int q = 0; q < adj[p].length; ++q) {
                if (adj[p][q] == 0) {
                    bfs(p, q);
                    count++;
                    pr.add(area);
                    area = 0;
                }
            }
        }

        System.out.println(count);

        while (!pr.isEmpty()) {
            System.out.print(pr.poll() + " ");
        }
    }

    static void settingOne(int a, int b, int c, int d) {
        for (int i = b; i < d; ++i) {
            for (int j = a; j < c; ++j) {
                adj[i][j] = 1;
            }
        }
    }

    static void bfs(int p, int q) {
        adj[p][q] = 1;

        Queue<Location> queue = new LinkedList<>();
        queue.offer(new Location(p, q));

        while (!queue.isEmpty()) {
            Location poll = queue.poll();
            area++;

            for (int i = 0; i < 4; ++i) {
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];
                if (nx >= 0 && nx < M && ny >= 0 && ny < N) {
                    if (adj[nx][ny] == 0) {
                        queue.offer(new Location(nx, ny));
                        adj[nx][ny] = 1;
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