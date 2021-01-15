package Baekjoon.Java.BOJ15600;

import java.util.Scanner;

public class Main_15649 {
    static int N, M;
    static boolean[] visit;
    static int[] list;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        N = input.nextInt();
        M = input.nextInt();
        visit = new boolean[N];
        list = new int[M];
        dfs(0);
    }

    static void dfs(int i) {
        if (i == M) {
            for (int val : list) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }

        for (int p = 0; p < N; ++p) {
            if (!visit[p]) {
                visit[p] = true;
                list[i] = p + 1;
                dfs(i + 1);
                visit[p] = false;
            }
        }
    }
}
