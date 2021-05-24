package Baekjoon.Java.BOJ21700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * created by jg 2021/05/25
 */
public class Main_21736 {
    private static char[][] list;
    private static boolean[][] visit;
    private static int N, M, count = 0;
    private static int[] nx = {1, -1, 0, 0};
    private static int[] ny = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        list = new char[N + 1][M + 1];
        visit = new boolean[N + 1][M + 1];

        for (int i = 0; i < N; ++i) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            for (int j = 0; j < M; ++j) {
                list[i + 1][j + 1] = s.charAt(j);
            }
        }

        for (int i = 1; i < N + 1; ++i) {
            for (int j = 1; j < M + 1; ++j) {
                if (!visit[i][j] && list[i][j] == 'I') {
                    bfs(new Location(i, j));
                }
            }
        }
        if (count == 0) {
            System.out.println("TT");
        } else {
            System.out.println(count);
        }
    }

    private static void bfs(Location location) {
        Queue<Location> queue = new LinkedList<>();
        queue.add(location);

        while (!queue.isEmpty()) {
            Location l = queue.poll();
            for (int i = 0; i < 4; ++i) {
                int ax = l.x + nx[i];
                int ay = l.y + ny[i];

                if (ax > 0 && ax < N + 1 && ay > 0 && ay < M + 1) {
                    if (!visit[ax][ay] && list[ax][ay] == 'P') {
                        queue.add(new Location(ax, ay));
                        visit[ax][ay] = true;
                        count++;
                    }
                    else if (!visit[ax][ay] && list[ax][ay] == 'O') {
                        queue.add(new Location(ax, ay));
                        visit[ax][ay] = true;
                    }
                }
            }
        }
    }
}

class Location {
    int x;
    int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
