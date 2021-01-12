package Baekjoon.Java.BOJ1200;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_1260_E {
    static boolean[] visit;
    static int[][] adj;
    static int N, M, V;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        N = input.nextInt();  // 정점의 개수
        M = input.nextInt();  // 간선의 개수
        V = input.nextInt();  // 탐색 시작 정점 번호
        adj = new int[N + 1][N + 1];
        visit = new boolean[N + 1];

        for (int i = 0; i < M; ++i) {
            int a = input.nextInt();
            int b = input.nextInt();
            adj[a][b] = 1;
            adj[b][a] = 1;
        }

        dfs(V);
        System.out.println();
        visit = new boolean[N + 1];
        bfs(V);

    }

    static void dfs(int start) {
        visit[start] = true;
        System.out.print(start + " ");

        for (int i = 1; i < N + 1; ++i) {
            if (!visit[i] && adj[start][i] == 1) {
                dfs(i);
            }
        }
    }

    static void bfs(int start) {
        visit[start] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);

        while (!queue.isEmpty()) {
            int a = queue.poll();
            System.out.print(a + " ");
            for (int i = 1; i < N + 1; ++i) {
                if (!visit[i] && adj[a][i] == 1) {
                    queue.offer(i);
                    visit[i] = true;
                }
            }
        }

    }
}
