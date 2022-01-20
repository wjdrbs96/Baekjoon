package Baekjoon.Java.BOJ17000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * created by Gyunny 2022/01/20
 */
public class Main_17086 {
    private static int N = 0, M = 0;
    private static int[][] adj;
    private static int[][] dist;
    private static int[] nx = {1, -1, 0, 0, 1, -1, 1, -1};
    private static int[] ny = {0, 0, 1, -1, 1, -1, -1, 1};
    private static int max = 0;
    private static final Queue<Node> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        adj = new int[N + 1][M + 1];
        dist = new int[N + 1][M + 1];

        for (int i = 1; i < N + 1; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < M + 1; ++j) {
                adj[i][j] = Integer.parseInt(st.nextToken());
                dist[i][j] = Integer.MAX_VALUE;
                if (adj[i][j] == 1) {
                    queue.add(new Node(i, j));
                    dist[i][j] = 0;
                }
            }
        }

        while (!queue.isEmpty()) {
            Node n = queue.poll();

            for (int i = 0; i < 8; ++i) {
                int ax = nx[i] + n.x;
                int ay = ny[i] + n.y;

                if (ax > 0 && ax < N + 1 && ay > 0 && ay < M + 1) {
                    if (dist[ax][ay] > dist[n.x][n.y] + 1) {
                        dist[ax][ay] = dist[n.x][n.y] + 1;
                        queue.add(new Node(ax, ay));
                        max = Math.max(dist[ax][ay], max);
                    }
                }
            }
        }

        System.out.println(max);
    }

}

class Node {
    int x;
    int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}