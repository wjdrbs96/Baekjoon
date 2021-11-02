package Baekjoon.Java.BOJ2700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * created by Gyunny 2021/11/02
 */
public class Main_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] list = new int[N];
        for (int i = 0; i < N; ++i) {
            list[i] = Integer.parseInt(st.nextToken());;
        }

        int max = 0;
        for (int i = 0; i < N - 2; ++i) {
            int sum = 0;
            for (int j = i + 1; j < N; ++j) {
                for (int k = j + 1; k < N; ++k) {
                    sum = (list[i] + list[j] + list[k]);
                    if (sum <= M) {
                        max = Math.max(max, sum);
                    }
                }
            }
        }

        System.out.println(max);
    }
}
