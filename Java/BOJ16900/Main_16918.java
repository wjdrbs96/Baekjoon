package Baekjoon.Java.BOJ16900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * created by Gyunny 2022/02/01
 */
public class Main_16918 {
    private static int R = 0, C = 0, N = 0;
    private static char[][] adj;
    private static boolean[][] visit;
    private static final int[] dx = {1, -1, 0, 0};
    private static final int[] dy = {0, 0, 1, -1};
    private static int[][] timeArray;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        adj = new char[R + 1][C + 1];
        visit = new boolean[R + 1][C + 1];
        timeArray = new int[R + 1][C + 1];

        for (int i = 1; i < R + 1; ++i) {
            String s = br.readLine();
            for (int j = 1; j < C + 1; ++j) {
                char ch = s.charAt(j - 1);
                adj[i][j] = ch;
                if (ch == 'O') {
                    timeArray[i][j] = 3;
                }
            }
        }

        int time = 1;
        while (time++ < N) {
            if (time % 2 == 0) {
                for (int i = 1; i < R + 1; ++i) {
                    for (int j = 1; j < C + 1; ++j) {
                        if (adj[i][j] == '.') {
                            adj[i][j] = 'O';
                            timeArray[i][j] = time + 3;
                        }
                    }
                }
            } else if (time % 2 == 1) {
                for (int i = 1; i < R + 1; ++i) {
                    for (int j = 1; j < C + 1; ++j) {
                        if (timeArray[i][j] == time) {
                            adj[i][j] = '.';

                            for (int k = 0; k < 4; ++k) {
                                int nx = dx[k] + i;
                                int ny = dy[k] + j;

                                if (nx > 0 && nx < R + 1 && ny > 0 && ny < C + 1) {
                                    if (adj[nx][ny] == 'O' && timeArray[nx][ny] != time) {
                                        timeArray[nx][ny] = 0;
                                        adj[nx][ny] = '.';
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for (int i = 1; i < R + 1; ++i) {
            for (int j = 1; j < C + 1; ++j) {
                System.out.print(adj[i][j]);
            }
            System.out.println();
        }

    }

}
