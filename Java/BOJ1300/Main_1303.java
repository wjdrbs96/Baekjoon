package Baekjoon.Java.BOJ1300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * created by Gyunny 2022/01/20
 * https://www.acmicpc.net/problem/1303
 */
public class Main_1303 {
    private static int N = 0, M = 0;
    private static char[][] adj;
    private static boolean[][] visit;
    private static int[] nx = {1, -1, 0, 0};
    private static int[] ny = {0, 0, 1, -1};
    private static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        adj = new char[N + 1][M + 1];
        visit = new boolean[N + 1][M + 1];

        for (int i = 0; i < N; ++i) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); ++j) {
                adj[i + 1][j + 1] = s.charAt(j);
            }
        }

        int resultW = 0;
        int resultB = 0;
        for (int i = 1; i < N + 1; ++i) {
            for (int j = 1; j < M + 1; ++j) {
                if (!visit[i][j]) {
                    count = 1;
                    bfs(new Node(i, j));
                    if (adj[i][j] == 'W') {
                        resultW += (count * count);
                    } else {
                        resultB += (count * count);
                    }
                }
            }
        }

        System.out.println(resultW + " " + resultB);
    }

    private static void bfs(Node node) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        visit[node.x][node.y] = true;

        while (!queue.isEmpty()) {
            Node n = queue.poll();

            for (int i = 0; i < 4; ++i) {
                int ax = nx[i] + n.x;
                int ay = ny[i] + n.y;

                if (ax > 0 && ax < N + 1 && ay > 0 && ay < M + 1) {
                    if (!visit[ax][ay]) {
                        if (adj[ax][ay] == adj[n.x][n.y]) {
                            count++;
                            queue.add(new Node(ax, ay));
                            visit[ax][ay] = true;
                        }
                    }
                }
            }
        }
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
