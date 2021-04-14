package Baekjoon.Java.BOJ1100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * created by jg 2021/04/14
 */
public class Main_1182 {
    private static int N, S, count = 0;
    private static int[] list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        list = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; ++i) {
            list[i] = Integer.parseInt(st.nextToken());
        }

        combination(0, 0);
        System.out.println(S == 0 ? --count : count);
    }

    private static void combination(int start, int sum) {
        if (start == N) {
            if (sum == S) {
                count++;
            }
            return;
        }
        combination(start + 1, sum + list[start]);
        combination(start + 1, sum);
    }
}
