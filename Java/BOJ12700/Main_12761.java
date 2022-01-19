package Baekjoon.Java.BOJ12700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * created by Gyunny 2022/01/20
 */
public class Main_12761 {
    private static int A = 0, B = 0, N = 0, M = 0;
    private static final boolean[] visit = new boolean[100001];
    private static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken()); // 스카이 콩콩 힘
        B = Integer.parseInt(st.nextToken()); // 스카이 콩콩 힘
        N = Integer.parseInt(st.nextToken()); // 동규 현재 위치
        M = Integer.parseInt(st.nextToken()); // 주미 현재 위치

        bfs();
    }

    private static void bfs() {
        visit[N] = true;
        Queue<Edge> queue = new LinkedList<>();
        queue.add(new Edge(N, 0));

        while (!queue.isEmpty()) {
            Edge a = queue.poll();

            if (a.x == M) {
                System.out.println(a.count);
                return;
            }

            if (a.x + 1 >= 0 && a.x + 1 < 100001) {
                if (!visit[a.x + 1]) {
                    queue.add(new Edge(a.x + 1, a.count + 1));
                    visit[a.x + 1] = true;
                }
            }

            if (a.x - 1 >= 0 && a.x - 1 < 100001) {
                if (!visit[a.x - 1]) {
                    queue.add(new Edge(a.x - 1, a.count + 1));
                    visit[a.x - 1] = true;
                }
            }

            if (a.x + A >= 0 && a.x + A < 100001) {
                if (!visit[a.x + A]) {
                    queue.add(new Edge(a.x + A, a.count + 1));
                    visit[a.x + A] = true;
                }
            }

            if (a.x - A >= 0 && a.x - A < 100001) {
                if (!visit[a.x - A]) {
                    queue.add(new Edge(a.x - A, a.count + 1));
                    visit[a.x - A] = true;
                }
            }

            if (a.x + B >= 0 && a.x + B < 100001) {
                if (!visit[a.x + B]) {
                    queue.add(new Edge(a.x + B, a.count + 1));
                    visit[a.x + B] = true;
                }
            }

            if (a.x - B >= 0 && a.x - B < 100001) {
                if (!visit[a.x - B]) {
                    queue.add(new Edge(a.x - B, a.count + 1));
                    visit[a.x - B] = true;
                }
            }

            if (a.x * A >= 0 && a.x * A < 100001) {
                if (!visit[a.x * A]) {
                    queue.add(new Edge(a.x * A, a.count + 1));
                    visit[a.x * A] = true;
                }
            }

            if (a.x * B >= 0 && a.x * B < 100001) {
                if (!visit[a.x * B]) {
                    queue.add(new Edge(a.x * B, a.count + 1));
                    visit[a.x * B] = true;
                }
            }
        }
    }
}

class Edge {
    int x;
    int count;

    public Edge(int x, int count) {
        this.x = x;
        this.count = count;
    }
}
