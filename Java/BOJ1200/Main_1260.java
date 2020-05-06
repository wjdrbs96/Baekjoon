package Baekjoon.Java.BOJ1200;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_1260 {
    boolean[] visited;
    boolean[] visit;
    public int[][] adj;
    int size;

    public Main_1260(int size) {
        this.size = size;
        adj = new int[size + 1][size + 1];
        visited = new boolean[size + 1];
        visit = new boolean[size + 1];
    }

    public void Edge(int start, int end) {
        adj[start][end] = 1;
        adj[end][start] = 1;
    }

    public void BFS(int v) {
        Queue<Integer> q = new LinkedList<>();
        visited[v] = true;
        System.out.print(v + " ");
        q.offer(v);

        while (!q.isEmpty()) {
            v = q.poll();
            for (int w = 1; w <= size; ++w) {
                if (adj[v][w] == 1 && !visited[w]) {
                    visited[w] = true;
                    System.out.print(w + " ");
                    q.offer(w);
                }
            }
        }

    }

    public void DFS(int v) {
        visit[v] = true;
        System.out.print(v + " ");
        for (int w = 1; w <= size; ++w) {
            if (adj[v][w] == 1 && !visit[w]) {
                DFS(w);
            }
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        Main_1260 ma = new Main_1260(n);
        int start = input.nextInt();

        for (int i = 0; i < m; ++i) {
            int a = input.nextInt();
            int b = input.nextInt();
            ma.Edge(a, b);
        }

        ma.DFS(start);
        System.out.println();
        ma.BFS(start);

    }
}
