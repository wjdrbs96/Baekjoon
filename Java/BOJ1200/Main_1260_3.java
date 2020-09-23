package Baekjoon.Java.BOJ1200;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_1260_3 {
    private static int N;
    private static int M;
    private static int[][] adj;
    private static boolean[] visit;
    private static boolean[] visit2;

    static void addEdge(int start, int end) {
        adj[start][end] = 1;
        adj[end][start] = 1;
    }

    static void dfs(int v) {
        visit[v] = true;
        System.out.print(v + " ");

        for (int i = 1; i < N + 1; ++i) {
            if (!visit[i] && adj[v][i] == 1) {
                dfs(i);
            }
        }
    }

    static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        visit2[v] = true;
        System.out.print(v + " ");

        while (!queue.isEmpty()) {
            int q = queue.poll();
            for (int i = 1; i < N + 1; ++i) {
                if (!visit2[i] && adj[q][i] == 1) {
                    queue.add(i);
                    visit2[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        N = input.nextInt();
        M = input.nextInt();
        int V = input.nextInt();

        adj = new int[N + 1][N + 1];
        visit = new boolean[N + 1];
        visit2 = new boolean[N + 1];

        for (int i = 0; i < M; ++i) {
            addEdge(input.nextInt(), input.nextInt());
        }

        dfs(V);
        System.out.println();
        bfs(V);
    }
}
