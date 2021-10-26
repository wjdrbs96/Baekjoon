package Baekjoon.Java.BOJ11000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * created by Gyunny 2021/10/26
 */
public class Main_11047_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] list = new int[N];

        for (int i = 0; i < N; ++i) {
            list[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        for (int i = list.length - 1; i >= 0; --i) {
            if (K / list[i] != 0) {
                count += (K / list[i]);
                K -= (list[i] * (K / list[i]));
            }
            if (K == 0) break;
        }

        System.out.println(count);
    }
}
