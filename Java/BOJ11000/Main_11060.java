package Baekjoon.Java.BOJ11000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * created by Gyunny 2022/01/21
 */
public class Main_11060 {
    private static int[] adj;
    private static int N = 0;
    private static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        adj = new int[N + 1];
        visit = new boolean[N + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; ++i) {
            adj[i] = Integer.parseInt(st.nextToken());
        }

        Queue<Edge> queue = new LinkedList<>();
        queue.add(new Edge(adj[0], 0, 0));
        visit[0] = true;
        boolean check = true;

        while (!queue.isEmpty()) {
            Edge e = queue.poll();

            if (e.idx == N - 1) {
                check = false;
                System.out.println(e.count);
                break;
            }

            for (int i = 1; i <= e.x; ++i) {
                if (i + e.idx >= 0 && i + e.idx < N) {
                    if (!visit[i + e.idx]) {
                        queue.add(new Edge(adj[i + e.idx], e.idx + i, e.count + 1));
                        visit[i + e.idx] = true;
                    }
                }
            }
        }

        if (check) {
            System.out.println(-1);
        }
    }
}

class Edge {
    int x;
    int idx;
    int count;

    public Edge(int x, int idx, int count) {
        this.x = x;
        this.idx = idx;
        this.count = count;
    }
}
