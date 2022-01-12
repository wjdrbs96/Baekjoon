package Baekjoon.Java.BOJ2100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * created by Gyunny 2021/12/14
 */
public class Main_2192 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        int[] list = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; ++i) {
            list[i] = Integer.parseInt(st.nextToken());  // 1일차 부터 N일차 까지 하루 방문자 수
        }

        int left = 0;
        int right = list.length - 1;

        int max = 0;
        int count = 0;
        while (left < list.length && right > 0) {
            if (list[left] + list[left + 1] < list[right] + list[right - 1]) {
                max = list[right] + list[right - 1];
                left++;
            } else {
                max = list[left] + list[left + 1];
                right--;
            }
        }

        System.out.println(max);
    }
}
