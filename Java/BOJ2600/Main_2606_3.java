package Baekjoon.Java.BOJ2600;

import java.util.Scanner;

public class Main_2606_3 {
    static int[][] adj;
    static boolean[] visit;
    static int N;
    static int M;
    static int count = 0;

    static void addEdge(int start, int end) {
        adj[start][end] = 1;
        adj[end][start] = 1;
    }

    static void dfs(int v) {
        visit[v] = true;

        for (int i = 1; i < N + 1; ++i) {
            if (!visit[i] && adj[v][i] == 1) {
                count++;
                dfs(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        N = input.nextInt(); // 컴퓨터의 수
        M = input.nextInt(); // 연결된 컴퓨터 쌍의 수
        adj = new int[N + 1][N + 1];
        visit = new boolean[N + 1];

        for (int i = 0; i < M; ++i) {
            addEdge(input.nextInt(), input.nextInt());
        }

        dfs(1);
        System.out.println(count);

    }
}
