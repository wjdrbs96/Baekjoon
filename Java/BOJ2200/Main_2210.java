package Baekjoon.Java.BOJ2200;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * created by jg 2021/03/21
 */
public class Main_2210 {
    private static int adj[][] = new int[6][6];
    private static Set<String> set = new HashSet<>();
    private static int[] dx = {1, -1, 0, 0};
    private static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 1; i < 6; ++i) {
            for (int j = 1; j < 6; ++j) {
                adj[i][j] = input.nextInt();
            }
        }

        for (int i = 1; i < 6; ++i) {
            for (int j = 1; j < 6; ++j) {
                dfs(i, j, "", 0);
            }
        }

        System.out.println(set.size());
    }

    private static void dfs(int x, int y, String s, int depth) {
        if (depth == 6) {
            set.add(s);
            return;
        }

        for (int i = 0; i < 4; ++i) {
            int nx = dx[i] + x;
            int ny = dy[i] + y;

            if (nx > 0 && nx < 6 && ny > 0 && ny < 6) {
                dfs(nx, ny, s + adj[nx][ny], depth + 1);
            }
        }
    }
}

