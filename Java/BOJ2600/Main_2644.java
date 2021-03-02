package Baekjoon.Java.BOJ2600;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_2644 {
    static int[][] adj;
    static boolean[] visit;
    static int a, b, n;
    static boolean isCheck = false;


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        n = input.nextInt(); // 전체 사람의 수

        // a와 b의 촌수를 구하기
        a = input.nextInt();
        b = input.nextInt();

        int m = input.nextInt(); // 부모 자식 간의 관계의 수
        adj = new int[n + 1][n + 1];
        visit = new boolean[n + 1];

        for (int i = 0; i < m; ++i) {
            int x = input.nextInt();
            int y = input.nextInt();
            adj[x][y] = 1;
            adj[y][x] = 1;
        }

        bfs();

        if (!isCheck) {
            System.out.println("-1");
        }
    }

    static void bfs() {
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(a, 0));
        visit[a] = true;

        while (!queue.isEmpty()) {
            Pair pair = queue.poll();

            if (pair.x == b) {
                System.out.println(pair.count);
                isCheck = true;
                break;
            }

            for (int i = 1; i <= n; ++i) {
                if (adj[pair.x][i] == 1 && !visit[i]) {
                    queue.offer(new Pair(i, pair.count + 1));
                    visit[i] = true;
                }
            }
        }
    }
}

class Pair {
    int x;
    int count;

    public Pair(int x, int count) {
        this.x = x;
        this.count = count;
    }
}

