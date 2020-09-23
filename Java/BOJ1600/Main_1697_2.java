package Baekjoon.Java.BOJ1600;

import java.util.*;

public class Main_1697_2 {
    static int[] visit = new int[100001];
    static int N;
    static int M;

    // 가장 빠른 시간
    static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        visit[v] = 1;
        queue.offer(v);

        while (!queue.isEmpty()) {
            int q = queue.poll();

            if (q - 1 >= 0 && visit[q - 1] == 0) {
                queue.offer(q - 1);
                visit[q - 1] = visit[q] + 1;
            }

            if (q + 1 <= 100000 && visit[q + 1] == 0) {
                queue.offer(q + 1);
                visit[q + 1] = visit[q] + 1;
            }

            if (q * 2 <= 100000 && visit[q * 2] == 0) {
                queue.offer(q * 2);
                visit[q * 2] = visit[q] + 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        N = input.nextInt(); // 수빈이의 위치
        M = input.nextInt(); // 동생이 있는 위치

        bfs(N);
        System.out.println(visit[M] - 1);
    }
}
