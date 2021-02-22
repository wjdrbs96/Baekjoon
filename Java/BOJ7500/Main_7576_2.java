package Baekjoon.Java.BOJ7500;

import java.util.*;

class Tomato {
    int x;
    int y;

    public Tomato(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main_7576_2 {
    static int N;
    static int M;
    static int[][] adj;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void bfs() {
        Queue<Tomato> queue = new LinkedList<>();
        Set<Integer> set = new HashSet<>();

        for (int i = 1; i <= M; ++i) {
            for (int j = 1; j <= N; ++j) {
                if (adj[i][j] == 1) {
                    queue.offer(new Tomato(i, j));
                }
            }
        }

        while (!queue.isEmpty()) {
            Tomato tomato = queue.poll();

            for (int i = 0; i < 4; ++i) {
                int nx = tomato.x + dx[i];
                int ny = tomato.y + dy[i];

                if (1 <= nx && nx <= M && 1 <= ny && ny <= N) {
                    if (adj[nx][ny] == 0) {
                        adj[nx][ny] = adj[tomato.x][tomato.y] + 1;
                        queue.offer(new Tomato(nx, ny));
                    }
                }
            }
        }

        if (TomatoCheck()) {
            for (int i = 1; i <= M; ++i) {
                for (int j = 1; j <= N; ++j) {
                    set.add(adj[i][j]);
                }
            }

            System.out.println(Collections.max(set) - 1);
        } else {
            System.out.println(-1);
        }


    }

    public static boolean TomatoCheck() {
        for (int i = 1; i <= M; ++i) {
            for (int j = 1; j <= N; ++j) {
                if (adj[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        M = input.nextInt();
        adj = new int[M + 1][N + 1];

        for (int i = 1; i <= M; ++i) {
            for (int j = 1; j <= N; ++j) {
                adj[i][j] = input.nextInt();
            }
        }

        bfs();

    }
}
