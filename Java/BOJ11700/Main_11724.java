package Baekjoon.Java.BOJ11700;

import java.util.Scanner;

public class Main_11724 {
    static int[][] adj;
    static boolean[] visit;
    static boolean check;
    int size;

    public Main_11724(int size) {
        this.size = size;
        adj = new int[size + 1][size + 1];
        visit = new boolean[size + 1];
    }

    public void edge(int start, int end) {
        adj[start][end] = 1;
        adj[end][start] = 1;
    }

    public void dfs(int v) {
        visit[v] = true;
        check = false;

        for (int w = 1; w <= size; ++w) {
            if (!visit[w] && adj[v][w] == 1) {
                dfs(w);
                check = true;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int M = input.nextInt();

        Main_11724 m = new Main_11724(N);

        for (int i = 0; i < M; ++i) {
            int a = input.nextInt();
            int b = input.nextInt();
            m.edge(a, b);
        }

        int count = 0;
        for (int i = 1; i <= N; ++i) {
            if (!visit[i]) {
                m.dfs(i);
                count++;
            }
        }


        System.out.println(count);

    }
}
