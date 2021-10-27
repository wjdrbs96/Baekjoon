package Baekjoon.Java.BOJ1400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * created by Gyunny 2021/10/27
 */
public class Main_1449_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 물이 새는 곳의 수
        int L = Integer.parseInt(st.nextToken()); // 테이프의 길이
        int[] list = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; ++i) {
            list[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(list);

        int count = 1;
        int idx = 0;

        for (int i = idx + 1; i < list.length; ++i) {
            if (list[idx] + L - 1 < list[i]) {
                count++;
                idx = i;
            }
        }

        System.out.println(count);
    }
}
