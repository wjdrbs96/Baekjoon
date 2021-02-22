package Baekjoon.Java.BOJ4900;

import java.util.Scanner;

public class Main_4963 {
    static int[][] adj;
    static int[] dx = {1, -1, 0, 0, -1, -1, 1, 1};             // 상하좌우 + 대각선까지 모두 체크
    static int[] dy = {0, 0, 1, -1, -1, 1, -1, 1};
    static int a;
    static int b;

    public static void dfs(int x, int y) {
        adj[x][y] = 0;

        for (int i = 0; i < 8; ++i) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (1 <= nx && nx <= b && 1 <= ny && ny <= a) {
                if (adj[nx][ny] == 1) {
                    dfs(nx, ny);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            a = input.nextInt();
            b = input.nextInt();

            if (a == 0 && b == 0) {
                break;
            }

            adj = new int[b + 1][a + 1];

            for (int i = 1; i <= b; ++i) {
                for (int j = 1; j <= a; ++j) {
                    adj[i][j] = input.nextInt();
                }
            }

            int total = 0;
            for (int i = 1; i <= b; ++i) {
                for (int j = 1; j <= a; ++j) {
                    if (adj[i][j] == 1) {
                        total++;
                        dfs(i, j);
                    }
                }
            }

            System.out.println(total);
        }
    }
}
