package Baekjoon.Java.BOJ1100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * created by Gyunny 2022/01/30
 */
public class Main_1182_2 {
    private static int[] adj;
    private static boolean[] visit;
    private static int N = 0, S = 0;
    private static int sum = 0;
    private static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        adj = new int[N + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < N + 1; ++i) {
            adj[i] = Integer.parseInt(st.nextToken());
        }

        visit = new boolean[N + 1];
        backTracking(0);
        System.out.println(count);
    }

    private static void backTracking(int depth) {
        if (depth == N) {
            if (sum == S) {
                count++;
            }
            return;
        }

        for (int i = 1; i < N + 1; ++i) {
            if (!visit[i]) {
                visit[i] = true;
                sum += adj[i];
                backTracking(depth + 1);
                visit[i] = false;
                sum -= adj[i];

            }
        }
    }

}
