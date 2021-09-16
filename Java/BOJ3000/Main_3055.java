package Baekjoon.Java.BOJ3000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * created by Gyunny 2021/09/14
 */
public class Main_3055 {
    private static int N, M, m, n;
    private static char[][] adj;
    private static boolean[][] visit;
    private static boolean[][] visitWater;
    private static int[] dx = {1, -1, 0, 0};
    private static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        adj = new char[N + 1][M + 1];
        visit = new boolean[N + 1][M + 1];
        visitWater = new boolean[N + 1][M + 1];

        int p = 0, q = 0;
        int a = 0, b = 0;

        for (int i = 1; i < N + 1; ++i) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); ++j) {
                char ch = s.charAt(j);
                adj[i][j + 1] = ch;
                if (ch == 'S') {
                    p = i;
                    q = j + 1;
                } else if (ch == '*') {
                    a = i;
                    b = j + 1;
                } else if (ch == 'D') {
                    m = i;
                    n = j + 1;
                }
            }
        }

        bfs(p, q, a, b);
    }

    private static void bfs(int x, int y, int a, int b) {
        visit[x][y] = true;
        Queue<Location> queue = new LinkedList<>();
        queue.add(new Location(x, y, 0));

        Queue<Location> water = new LinkedList<>();
        water.add(new Location(a, b));
        visitWater[a][b] = true;

        while (!queue.isEmpty()) {
            Location location = queue.poll();
            Location locationWater = water.poll();

            if (location.x == m && location.y == n) {
                System.out.println(location.count);
                return;
            }

            for (int i = 0; i < 4; ++i) {
                int nx = dx[i] + location.x;
                int ny = dy[i] + location.y;
                int na = dx[i] + locationWater.x;
                int nb = dy[i] + locationWater.y;

                if (na > 0 && na < N + 1 && nb > 0 && nb < M + 1) {
                    if (adj[na][nb] == '.' && !visitWater[na][nb]) {
                        adj[na][nb] = '*';
                        visitWater[na][nb] = true;
                        water.add(new Location(na, nb));
                    }
                }

//                System.out.println(na + " " + nb);
                if (nx > 0 && nx < N + 1 && ny > 0 && ny < M + 1 && adj[nx][ny] != '*') {
                    if ((adj[nx][ny] == '.' || adj[nx][ny] == 'D') && !visit[nx][ny]) {
                        for (int u = 0; u < 4; ++u) {
                            
                        }
                        System.out.println(nx + " " + ny + " " + location.count);
                        visit[nx][ny] = true;
                        queue.add(new Location(nx, ny, location.count + 1));
                    }
                }

            }

            System.out.println("===");
            for (int i = 1; i < adj.length; ++i) {
                for (int j = 1; j < adj.length; ++j) {
                    System.out.print(adj[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("===");

        }
    }

}

class Location {
    int x;
    int y;
    int count = 0;

    public Location(int x, int y, int count) {
        this.x = x;
        this.y = y;
        this.count = count;
    }

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
