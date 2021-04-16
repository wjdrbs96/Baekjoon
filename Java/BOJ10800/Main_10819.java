package Baekjoon.Java.BOJ10800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10819 {
    private static int N;
    private static int[] list;
    private static int[] list2;
    private static boolean[] visit;
    private static int sum = 0;
    private static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        list = new int[N];
        list2 = new int[N];
        visit = new boolean[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; ++i) {
            list[i] = Integer.parseInt(st.nextToken());
        }

        backTracking(0);
        System.out.println(max);
    }

    private static void backTracking(int depth) {
        if (depth == N) {
            for (int i = 0; i < list.length - 1; ++i) {
                sum += Math.abs(list2[i + 1] - list2[i]);
            }

            max = Math.max(max, sum);
            sum = 0;
            return;
        }

        for (int i = 0; i < N; ++i) {
            if (!visit[i]) {
                visit[i] = true;
                list2[depth] = list[i];
                backTracking(depth + 1);
                visit[i] = false;
            }
        }
    }
}
