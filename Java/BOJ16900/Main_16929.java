package Baekjoon.Java.BOJ16900;

import java.util.Scanner;

/**
 * created by jg 2021/04/21
 */
public class Main_16929 {

    static char[][] a;
    static boolean[][] visited;
    final static int dy[] = new int[]{1, -1, 0, 0};
    final static int dx[] = new int[]{0, 0, 1, -1};
    static int n, m;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        a = new char[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; ++i) {
            a[i] = sc.next().toCharArray();
        }
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < m; ++j) {

                if (visited[i][j] ==  false) {
                    boolean cand = dfs(i,j,-1,-1,a[i][j]);
                    if(cand) {
                        System.out.println("Yes");
                        System.exit(0);
                    }
                }
            }
        System.out.println("No");
    }

    static boolean dfs(int y, int x, int by, int bx, char alp) {

        if (visited[y][x]) return true;

        visited[y][x] = true;

        for (int k = 0; k < 4; ++k) {
            int ny = y + dy[k];
            int nx = x + dx[k];
            if (!(0 <= ny && ny < n && 0 <= nx && nx < m)) continue;
            if (a[ny][nx] != alp) continue;
            if (ny == by && nx == bx) continue;

            if(dfs(ny, nx, y, x, alp))
                return true;
        }
        return false;
    }
}
