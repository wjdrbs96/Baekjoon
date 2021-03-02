package Baekjoon.Java.BOJ3100;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_3184 {
    private static int r, c;
    private static int sheep, wolf;
    private static char[][] adj;
    private static boolean[][] visit;
    private static int[] dx = {1, -1, 0, 0};
    private static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        r = input.nextInt();
        c = input.nextInt();

        adj = new char[r + 1][c + 1];
        visit = new boolean[r + 1][c + 1];

        for (int i = 1; i <= r; ++i) {
            String line = input.next();
            for (int j = 0; j < line.length(); ++j) {
                char c = line.charAt(j);
                if (c == 'v') wolf++;
                else if (c == 'o') sheep++;
                adj[i][j + 1] = c;
            }
        }

        for (int i = 1; i <= r; ++i) {
            for (int j = 1; j <= c; ++j) {
                if (adj[i][j] != '#' && !visit[i][j]) {
                    bfs(i, j);
                    //System.out.println(i + " " + j);
                }
            }
        }

        System.out.println(sheep + " " + wolf);
    }

    static void bfs(int i, int j) {
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(i, j));
        visit[i][j] = true;

        int s = 0; // 양
        int w = 0; // 늑대

        if (adj[i][j] == 'v') {
            w++;
        } else if (adj[i][j] == 'o') {
            s++;
        }

        while (!queue.isEmpty()) {
            Pair pair = queue.poll();

            for (int p = 0; p < 4; ++p) {
                int nx = dx[p] + pair.x;
                int ny = dy[p] + pair.y;

                if (nx > 0 && nx <= r && ny > 0 && ny <= c) {
                    if (!visit[nx][ny] && adj[nx][ny] != '#') {
                        // 양을 만났을 때
                        if (adj[nx][ny] == 'o') {
                            s++;
                        }
                        // 늑대를 만났을 때
                        else if (adj[nx][ny] == 'v') {
                            w++;
                        }
                        queue.offer(new Pair(nx, ny));
                        visit[nx][ny] = true;
                    }
                }
            }
        }

        // 늑대가 더 많으면
        if (s <= w) {
            sheep -= s;
        }
        // 양이 더 많으면
        else {
            wolf -= w;
        }
    }
}

class Pair {
    int x;
    int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}