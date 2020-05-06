package Baekjoon.Java.BOJ1200;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_1260_2 {
    boolean[] visitBFS;
    boolean[] visitDFS;
    int[][] adj;
    int size;

    public Main_1260_2(int size) {
        this.size = size;
        visitBFS = new boolean[size + 1];
        visitDFS = new boolean[size + 1];
        adj = new int[size + 1][size + 1];
    }

    public void edge(int start, int end) {
        adj[start][end] = 1;
        adj[end][start] = 1;
    }

    public void dfs(int v) {
        visitDFS[v] = true;
        System.out.print(v + " ");

        for (int w = 1; w <= size; ++w) {
            if (!visitDFS[w] && adj[v][w] == 1) {
                dfs(w);
            }
        }
    }

    public void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        System.out.print(v + " ");
        visitBFS[v] = true;

        while (!queue.isEmpty()) {
            v = queue.poll();
            for (int w = 1; w <= size; ++w) {
                if (!visitBFS[w] && adj[v][w] == 1) {
                    visitBFS[w] = true;
                    queue.offer(w);
                    System.out.print(w + " ");
                }
            }

        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int M = input.nextInt();
        int V = input.nextInt();

        Main_1260_2 m = new Main_1260_2(N);

        for (int i = 0; i < M; ++i) {
            int a = input.nextInt();
            int b = input.nextInt();
            m.edge(a, b);
        }

        m.dfs(V);
        System.out.println();
        m.bfs(V);


    }
}
