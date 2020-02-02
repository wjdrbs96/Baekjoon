package Baekjoon.Java.BOJ2600;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main_2667 {
    static int[][] adj;
    static int N;
    static int[] dx = {1, -1, 0, 0};   // 행 조절 (상, 하)
    static int[] dy = {0, 0, 1, -1};   // 열 조절 (좌, 우)
    static int count;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        N = input.nextInt();
        adj = new int[N][N];

        for (int i = 0; i < N; ++i) {
            String s = input.next();
            for (int j = 0; j < N; ++j) {
                adj[i][j] = s.charAt(j) - '0';
            }
        }

        int total = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                if (adj[i][j] == 1) {
                    count = 0;
                    total++;

                    dfs(i, j);

                    pq.add(count);
                }
            }
        }

        System.out.println(total);

        while (!pq.isEmpty()) {
            System.out.println(pq.poll() + " ");
        }

    }

    static void dfs(int x, int y) {
        adj[x][y] = 0;
        count++;

        for (int i = 0; i < 4; ++i) {
            int nx = x + dx[i];            // for 문과 dx, dy를 통해서 상하 좌우를 다 탐색함 
            int ny = y + dy[i];

            if (0 <= nx && nx < N && 0 <= ny && ny < N) {  // 행렬 내에서만 탐색하기 위해서 조건을 준 것임
                if (adj[nx][ny] == 1) {
                    dfs(nx, ny);
                }
            }
        }

    }
}
