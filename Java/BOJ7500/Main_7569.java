package Baekjoon.Java.BOJ7500;

import java.util.*;

public class Main_7569 {
    static int M;
    static int N;
    static int H;
    static int[][][] adj;
    static int[] dx = {1, -1, 0, 0, 0, 0};
    static int[] dy = {0, 0, 1, -1, 0, 0};
    static int[] dz = {0, 0, 0, 0, 1, -1};

    public static void BFS() {
        Queue<Coodi> q = new LinkedList<>();
        Set<Integer> set = new HashSet<>();

        for (int k = 1; k <= H; ++k) {
            for (int i = 1; i <= N; ++i) {
                for (int j = 1; j <= M; ++j) {
                    if (adj[k][i][j] == 1) {
                        q.offer(new Coodi(k, i, j));
                    }
                }
            }
        }

        while (!q.isEmpty()) {
            Coodi c = q.poll();

            for (int i = 0; i < 6; ++i) {
                int nx = c.x + dx[i];
                int ny = c.y + dy[i];
                int nz = c.z + dz[i];

                if (nx >= 1 && nx <= N && ny >= 1 && ny <= M && nz >= 1 && nz <= H && adj[nz][nx][ny] == 0) {
                    q.offer(new Coodi(nz, nx, ny));
                    adj[nz][nx][ny] = adj[c.z][c.x][c.y] + 1;
                }
            }


        }

        if (Check()) {
            for (int k = 1; k <= H; ++k) {
                for (int i = 1; i <= N; ++i) {
                    for (int j = 1; j <= M; ++j) {
                        set.add(adj[k][i][j]);
                    }
                }
            }

            System.out.println(Collections.max(set) - 1);

        } else {
            System.out.println(-1);
        }

    }


    public static boolean Check() {
        for (int k = 1; k <= H; ++k) {
            for (int i = 1; i <= N; ++i) {
                for (int j = 1; j <= M; ++j) {
                    if (adj[k][i][j] == 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        M = input.nextInt();
        N = input.nextInt();
        H = input.nextInt();

        adj = new int[H + 1][N + 1][M + 1];

        for (int i = 1; i <= H; ++i) {
            for (int j = 1; j <= N; ++j) {
                for (int k = 1; k <= M; ++k) {
                    adj[i][j][k] = input.nextInt();
                }
            }
        }

        BFS();


    }
}

class Coodi{
    int x;
    int y;
    int z;

    public Coodi(int z, int x, int y) {
        this.z = z;
        this.x = x;
        this.y = y;
    }

}
