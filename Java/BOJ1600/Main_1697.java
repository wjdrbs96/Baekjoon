package Baekjoon.Java.BOJ1600;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_1697 {
    static int N, K;
    static int[] visit = new int[100001];

    public static void BFS() {
        Queue<Integer> q = new LinkedList<>();

        q.offer(N);
        visit[N] = 1;

        while(!q.isEmpty()) {
            N = q.poll();

            if (N == K) break;

            if (N + 1 <= 100000 && visit[N+1] == 0) {
                q.offer(N + 1);
                visit[N + 1] = visit[N] + 1;
            }

            if (N - 1 >= 0 && visit[N-1] == 0) {
                q.offer(N - 1);
                visit[N - 1] = visit[N] + 1;
            }

            if (N * 2 <= 100000 && visit[N*2] == 0) {
                q.offer(N * 2);
                visit[N * 2] = visit[N] + 1;
            }
        }
        System.out.println(visit[K] - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        N = input.nextInt();
        K = input.nextInt();

        BFS();


    }
}
