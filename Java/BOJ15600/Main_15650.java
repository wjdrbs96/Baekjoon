package Baekjoon.Java.BOJ15600;

import java.util.Scanner;

public class Main_15650 {
    static int N;
    static int M;
    static boolean[] visit;
    static int[] list;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        N = input.nextInt();
        M = input.nextInt();

        visit = new boolean[N + 1];
        list = new int[M + 1];
        dfs(1);
    }

    static void dfs(int k) {
        if (k == M + 1) {
            if (checkSuyeol()) {
                for (int p = 1; p < list.length; ++p) {
                    System.out.print(list[p] + " ");
                }
                System.out.println();
                return;
            }
            return;
        }

        for (int i = 1; i <= N; ++i) {
            if (!visit[i]) {
                visit[i] = true;
                list[k] = i;
                dfs(k + 1);
                visit[i] = false;
            }
        }
    }

    static boolean checkSuyeol() {
        for (int i = 1; i < list.length - 1; ++i) {
            if (list[i] >= list[i + 1]) {
                return false;
            }
        }

        return true;
    }
}
