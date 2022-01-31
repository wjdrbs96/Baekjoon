package Baekjoon.Java.BOJ11100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * created by Gyunny 2022/02/01
 */
public class Main_11123 {
    private static int N = 0;
    private static int H = 0, W = 0;
    private static char[][] adj;
    private static boolean[][] visit;
    private static final int[] dx = {1, -1, 0, 0};
    private static final int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            H = Integer.parseInt(st.nextToken());
            W = Integer.parseInt(st.nextToken());

            adj = new char[H + 1][W + 1];
            visit = new boolean[H + 1][W + 1];

            for (int j = 0; j < H; ++j) {
                String s = br.readLine();
                for (int k = 0; k < W; ++k) {
                    adj[j + 1][k + 1] = s.charAt(k);
                }
            }

            int count = 0;
            for (int j = 1; j < H + 1; ++j) {
                for (int k = 1; k < W + 1; ++k) {
                    if (!visit[j][k] && adj[j][k] == '#') {
                        dfs(j, k);
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }

    private static void dfs(int x, int y) {
        visit[x][y] = true;

        for (int i = 0; i < 4; ++i) {
            int nx = dx[i] + x;
            int ny = dy[i] + y;

            if (nx > 0 && nx < H + 1 && ny > 0 && ny < W + 1) {
                if (!visit[nx][ny] && adj[nx][ny] == '#') {
                    dfs(nx, ny);
                }
            }
        }
    }
}
