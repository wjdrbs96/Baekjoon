package Baekjoon.Java.BOJ1700;

import java.util.Scanner;

public class Main_1707 {
    static int[][] adj;
    int size;

    public Main_1707(int size) {
        adj = new int[size + 1][size + 1];
        this.size = size;
    }

    public void dfs(int[] color, int x, int c) {

        for (int w = 1; w <= size; ++w) {

        }
    }

    public void edge(int start, int end) {
        adj[start][end] = 1;
        adj[end][start] = 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int K = input.nextInt();

        for (int i = 0; i < K; ++i) {
            int N = input.nextInt();
            int E = input.nextInt();
            Main_1707 m = new Main_1707(N);

            for (int j = 0; j < E; ++j) {
                int a = input.nextInt();
                int b = input.nextInt();
                m.edge(a, b);
            }

            int[] color = new int[N + 1];

        }
    }
}
