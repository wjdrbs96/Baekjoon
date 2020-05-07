package Baekjoon.Java.BOJ1000;

import java.util.Scanner;

public class Main_1012_2 {
    static int[][] adj;


    public static void edge(int start, int end) {
        adj[start][end] = 1;
    }

    public static void dfs(int start, int end) {

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();
        int M = input.nextInt();
        int N = input.nextInt();
        int K = input.nextInt();
        adj = new int[M + 1][N + 1];

        for (int i = 0; i < t; ++i) {
            for (int j = 0; j < K; ++j) {
                int a = input.nextInt();
                int b = input.nextInt();
                edge(a, b);
            }
        }



    }
}
