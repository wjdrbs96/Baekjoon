package Baekjoon.Java.BOJ15600;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * created by Gyunny 2022/02/01
 */
public class Main_15686 {
    private static int N = 0, M = 0;
    private static int[][] adj;
    private static boolean[][] visit;
    private static final int[] dx = {1, -1, 0, 0};
    private static final int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        adj = new int[N + 1][N + 1];

        for (int i = 1; i < N + 1; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < N + 1; ++j) {
                adj[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < N + 1; ++i) {
            for (int j = 1; j < N + 1; ++j) {

            }
        }
    }
}

class Edge {
    int x;
    int y;
    int count;

    public Edge(int x, int y, int count) {
        this.x = x;
        this.y = y;
        this.count = count;
    }
}