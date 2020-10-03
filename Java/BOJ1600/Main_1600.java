package Baekjoon.Java.BOJ1600;

import java.util.Scanner;

public class Main_1600 {
    static int[][] adj;
    static boolean[][] visit;
    static int k, W, H;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int[] dx1 = {2, 2, 1, 1, -2, -2 ,-1, -1};
    static int[] dy1 = {1, -1, 2, -2, 1, -1, 2, -2};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        k = input.nextInt();

        W = input.nextInt();  // 가로 길이
        H = input.nextInt();  // 세로 길이

        adj = new int[H + 1][W + 1];
        visit = new boolean[H + 1][W + 1];

        for (int i = 1; i < H + 1; ++i) {
            for (int j = 1; j < W + 1; ++j) {
                adj[i][j] = input.nextInt();
            }
        }



    }

    static void bfs() {

    }
}
