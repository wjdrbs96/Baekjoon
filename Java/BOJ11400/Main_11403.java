package Baekjoon.Java.BOJ11400;

import java.util.Scanner;

public class Main_11403 {
    static int n;
    static int[][] adj;

    public static void DFS(int[] visited, int v, boolean isPossible) {
        if (isPossible) {
            visited[v] = 1;
        }

        for (int w = 1; w <= n; ++w) {
            if (visited[w] == 0 && adj[v][w] == 1) {
                DFS(visited, w,true);
            }
        }

    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        adj = new int[n + 1][n + 1];
        int[][] list = new int[n + 1][n + 1];

        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n; ++j) {
                adj[i][j] = input.nextInt();
            }
        }

        for (int i = 1; i <= n; ++i) {
            int[] visited = new int[n + 1];
            DFS(visited, i, false);
            for (int j = 1; j <= n; ++j) {
                System.out.print(visited[j] + " ");
            }
            System.out.println();
        }


    }
}
