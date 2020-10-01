package Baekjoon.Java.BOJ2600;

import java.util.Scanner;

public class Main_2636 {
    static int N, M;
    static int[][] adj;
    static boolean[][] visit;


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        N = input.nextInt();  // 세로 길이
        M = input.nextInt();  // 가로 길이
        adj = new int[N + 1][M + 1];
        visit = new boolean[N + 1][M + 1];

        for (int i = 1; i < N + 1; ++i) {
            for (int j = 1; j < M + 1; ++j) {
                adj[i][j] = input.nextInt();
            }
        }
    }
}

class Cheese {
    int x;
    int y;

    public Cheese(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
