package Baekjoon.Java.BOJ2200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main_2212 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] list = new int[N];
        for (int i = 0; i < N; ++i) {
            list[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(list);

        Integer[] diff = new Integer[N - 1];

        for (int i = 0; i < N - 1; ++i) {
            diff[i] = list[i + 1] - list[i];
        }

        Arrays.sort(diff, Collections.reverseOrder());

        int sum = 0;
        for (int i = K - 1; i < N - 1; ++i) {
            sum += diff[i];
        }

        System.out.println(sum);
    }
}
