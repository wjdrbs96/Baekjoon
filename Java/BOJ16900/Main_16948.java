package Baekjoon.Java.BOJ16900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * created by jg 2021/04/21
 */
public class Main_16948 {
    private static int N;
    private static int[][] adj;
    private static boolean[][] visit;
    private static int[] nx = {-2, -2, 0, 0, 2, 2};
    private static int[] ny = {-1, 1, -2, 2, -1 ,1};
    private static boolean check = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        adj = new int[N][N];
        visit = new boolean[N][N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        Location location1 = new Location(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), 0);
        Location location2 = new Location(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), 0);

        bfs(location1, location2);
        if (!check) {
            System.out.println(-1);
        }
    }

    private static void bfs(Location location1, Location location2) {
        Queue<Location> queue = new LinkedList<>();

        queue.add(location1);

        while (!queue.isEmpty()) {
            Location l = queue.poll();

            if (l.x == location2.x && l.y == location2.y) {
                System.out.println(l.count);
                check = true;
                return;
            }

            for (int i = 0; i < 6; ++i) {
                int ax = nx[i] + l.x;
                int ay = ny[i] + l.y;

                if (ax >= 0  && ax < N && ay >= 0 && ay < N) {
                    if (!visit[ax][ay]) {
                        visit[ax][ay] = true;
                        queue.add(new Location(ax, ay, l.count + 1));
                    }
                }
            }
        }
    }
}

class Location {
    int x;
    int y;
    int count;

    public Location(int x, int y, int count) {
        this.x = x;
        this.y = y;
        this.count = count;
    }
}
