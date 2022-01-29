package Baekjoon.Java.BOJ6100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * created by Gyunny 2022/01/26
 * https://www.acmicpc.net/problem/6118
 */
public class Main_6118 {
    private static int N = 0, M = 0;
    private static int[][] adj;
    private static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        adj = new int[N + 1][N + 1];
        visit = new boolean[N  +1];

        for (int i = 0; i < M; ++i) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adj[a][b] = 1;
            adj[b][a] = 1;
        }

        Queue<Edge> queue = new LinkedList<>();
        queue.add(new Edge(1, 0));
        visit[1] = true;

        int nodeCount = 1;
        int max = Integer.MIN_VALUE;
        int nodeNumber = Integer.MAX_VALUE;

        while (!queue.isEmpty()) {
            Edge e = queue.poll();

            if (max == e.count) {
                nodeCount++;
                nodeNumber = Math.min(nodeNumber, e.x);

            } else if (max < e.count) {
                max = e.count;
                nodeCount = 1;
                nodeNumber = e.x;
            }

            for (int i = 1; i <= N; ++i) {
                if (adj[e.x][i] == 1 && adj[i][e.x] == 1) {
                    if (!visit[i]) {
                        queue.add(new Edge(i, e.count + 1));
                        visit[i] = true;
                    }
                }
            }
        }

        System.out.println(nodeNumber + " " + max + " " + nodeCount);

    }
}

class Edge {
    int x;      // 2 (시작 노드 번호)
    int count; // 1 (1부터 x 까지 걸린 카운트)

    public Edge(int x, int count) {
        this.x = x;
        this.count = count;
    }
}
