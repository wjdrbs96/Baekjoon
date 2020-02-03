package Baekjoon.Java.BOJ7500;

import java.util.*;

public class Main_7576 {
    static int[][] adj;
    static int dx[] = {1, -1, 0, 0};
    static int dy[] = {0, 0, 1, -1};

    public static void BFS(int N, int M) {
        Queue<Save> q = new LinkedList<>();
        Set<Integer> list = new HashSet<>();

        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < M; ++j) {
                if (adj[i][j] == 1) {
                    q.offer(new Save(i, j));   // 익은 모두 토마토를 큐에 넣기
                }
            }
        }

        while(!q.isEmpty()) {
            Save s = q.poll();

            for (int i = 0; i < 4; ++i) {
                int nx = s.x + dx[i];
                int ny = s.y + dy[i];

                if (nx >= 0 && nx < N && ny >= 0 && ny < M) {
                    if (adj[nx][ny] == 0) {
                        q.offer(new Save(nx, ny));
                        adj[nx][ny] = adj[s.x][s.y] + 1;
                    }
                }
            }
        }

        if (TomatoCheck(N, M)) {
            for (int i = 0; i < N; ++i) {
                for (int j = 0; j < M; ++j) {
                    list.add(adj[i][j]);
                }
            }

            System.out.println(Collections.max(list) - 1);

        }

        else {
            System.out.println(-1);
        }

    }

    public static boolean TomatoCheck(int N, int M) {   // 다 익었는지 확인 메소드
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < M; ++j) {
                if (adj[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int M = input.nextInt();
        int N = input.nextInt();
        adj = new int[N][M];

        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < M; ++j) {
                adj[i][j] = input.nextInt();
            }
        }


        BFS(N, M);
    }
}

class Save {
    int x;
    int y;

    public Save(int x, int y) {
        this.x = x;
        this.y = y;
    }
}