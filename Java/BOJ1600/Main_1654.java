package Baekjoon.Java.BOJ1600;

import java.util.Arrays;
import java.util.Scanner;

/**
 * created by jg 2021/03/31
 */
public class Main_1654 {
    private static int K, N;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        K = input.nextInt();  // 이미 가지고 있는 랜선의 개수
        N = input.nextInt();  // 필요한 랜선의 개수

        int[] list = new int[K];
        for (int i = 0; i < K; ++i) {
            list[i] = input.nextInt();
        }

        Arrays.sort(list);
        binarySearch(list, 1, list[list.length - 1]);
    }

    private static void binarySearch(int[] list, long left, long right) {
        while (left <= right) {
            long mid = (left + right) / 2;
            int sum = 0;

            for (int i = 0; i < K; ++i) {
                sum += (list[i] / mid);
            }

            // 랜선의 길이가 너무 길 때
            if (N > sum) {
                right = mid - 1;
            }
            // 랜선의 길이를 좀 더 길게 짤라도 될 때
            else {
                left = mid + 1;
            }
        }
        System.out.println(right);
    }
}
