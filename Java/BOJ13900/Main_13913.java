package Baekjoon.Java.BOJ13900;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_13913 {
    static int N;
    static int K;
    static int[] visited = new int[100001];
    static int[] from = new int[100001];

    public static void print(int n, int m) {
        if (n != m) {
            print(n, from[m]);
        }
        System.out.print(m + " ");
    }

    public static void BFS() {
        Queue<Integer> q = new LinkedList<>();
        q.offer(N);
        visited[N] = 0;

        while (!q.isEmpty()) {
            N = q.poll();
            if (N == K) break;

            if (N + 1 <= 100000 && visited[N + 1] == 0) {
                q.offer(N + 1);
                visited[N + 1] = visited[N] + 1;
                from[N + 1] = N;
            }

            if (N - 1 >= 0 && visited[N - 1] == 0) {
                q.offer(N - 1);
                visited[N - 1] = visited[N] + 1;
                from[N - 1] = N;
            }

            if (2 * N <= 100000 && visited[2 * N] == 0) {
                q.offer(2 * N);
                visited[2 * N] = visited[N] + 1;
                from[2 * N] = N;
            }
        }

        System.out.println(visited[K]);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        N = input.nextInt();
        K = input.nextInt();

        int a = N;
        int b = K;

        BFS();
        print(a, b);



    }
}
