package Baekjoon.Java.BOJ1100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * created by Gyunny 2021/11/02
 */
public class Main_1182_2 {
    private static int N, S, count = 0, sum = 0;
    private static int[] list;
    private static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        visit = new boolean[N];
        list = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; ++i) {
            list[i] = Integer.parseInt(st.nextToken());
        }

        backTracking(0);
        System.out.println(count);
    }

    private static void backTracking(int depth) {

    }

}
