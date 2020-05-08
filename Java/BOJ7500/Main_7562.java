package Baekjoon.Java.BOJ7500;

import java.util.*;

public class Main_7562 {
    static int[][] adj;
    static int[] dx = {2, 1, 2, 1, -2, -2, -1, -1};
    static int[] dy = {1, 2, -1, -2, -1, 1, -2, 2};
    static boolean[][] visit;
    static int l;

    public static void bfs(List<Knight> list) {
        Knight start = list.get(0);                 // 출발점
        Knight end = list.get(1);                   // 도착점
        visit[start.x][start.y] = true;

        if (start.x == end.x && start.y == end.y) {
            System.out.println(0);
            return;
        }

        Queue<Knight> queue = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        queue.offer(start);

        out:while (!queue.isEmpty()) {
            Knight k = queue.poll();
            for (int i = 0; i < 8; ++i) {
                int nx = k.x + dx[i];
                int ny = k.y + dy[i];

                if (nx == end.x && ny == end.y) {
                    break out;
                }

                if (0 <= nx && nx < l && 0 <= ny && ny < l) {
                    if (!visit[nx][ny]) {
                        queue.offer(new Knight(nx, ny));
                        adj[nx][ny] = adj[k.x][k.y] + 1;
                        visit[nx][ny] = true;
                    }
                }
            }
        }

        for (int i = 0; i < l; ++i) {
            for (int j = 0; j < l; ++j) {
                set.add(adj[i][j]);
            }
        }

        System.out.println(Collections.max(set));

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();
        List<Knight> list = new ArrayList<>();

        for (int i = 0; i < t; ++i) {
            l = input.nextInt();
            adj = new int[l][l];
            visit = new boolean[l][l];

            for (int j = 0; j < 2; ++j) {
                int a = input.nextInt();
                int b = input.nextInt();
                list.add(new Knight(a, b));
            }

            bfs(list);
            list.clear();


        }
    }
}

class Knight {
    int x;
    int y;

    public Knight(int x, int y) {
        this.x = x;
        this.y = y;
    }
}