package Baekjoon.Java.BOJ2800;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * created by jg 2021/04/04
 */
public class Main_2805 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int M = input.nextInt();

        int[] list = new int[N];

        for (int i = 0; i < N; ++i) {
            list[i] = input.nextInt();
        }

        Arrays.sort(list);

        int left = 0;
        int right = list[list.length - 1];

        int result = 0;

        while (left <= right) {
            long sum = 0;
            int mid = (left + right) / 2;

            for (int i = 0; i < N; ++i) {
                if (list[i] - mid > 0) {
                    sum += (list[i] - mid);
                }
            }

            // 줄여야 함
            if (sum >= M) {
                left = mid + 1;
                result = mid;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(result);
    }
}
