package Baekjoon.Java.BOJ2600;

// 2606번 다시 풀기

import java.util.Scanner;

public class Main_2606_2 {
    static int[][] adj;
    static boolean[] visit;
    int size;
    static int count = 0;

    public Main_2606_2(int size) {
        adj = new int[size + 1][size + 1];
        visit = new boolean[size + 1];
        this.size = size;
    }


    public static void edge(int start, int end) {
        adj[start][end] = 1;
        adj[end][start] = 1;
    }

    public void dfs(int v) {
        visit[v] = true;

        for (int w = 1; w <= size; ++w) {
            if (adj[v][w] == 1 && !visit[w]) {
                count++;
                dfs(w);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int M = input.nextInt();
        Main_2606_2 m = new Main_2606_2(N);

        for (int i = 0; i < M; ++i) {
            int a = input.nextInt();
            int b = input.nextInt();
            edge(a, b);
        }

        m.dfs(1);
        System.out.println(count);


    }
}
