package Baekjoon.Java.BOJ17300;

import java.util.Scanner;

/**
 * created by jg 2021/04/01
 */
public class Main_17393 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        long[] a = new long[n + 1];
        long[] b = new long[n + 1];

        for (int i = 1; i < n + 1; ++i) {
            a[i] = input.nextLong();
        }

        for (int i = 1; i < n + 1; ++i) {
            b[i] = input.nextLong();
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < n; ++i) {
            int left = i + 1;           // b 첫 번째
            int right = b.length - 1;  // b 마지막
            long tempA = a[i];
            int count = 0;

            // i = 1일 때 tempA = 60, b[left] = 70
            if (tempA >= b[left]) {
                // 이분 탐색
                while (left <= right) {
                    int mid = (left + right) / 2;

                    // A 가 B 보다 더 큰 거니까 오른쪽으로 더 갈 수 있는 거
                    if (b[mid] <= tempA) {
                        left = mid + 1;
                        count = mid;  // ?
                    }
                    else {
                        right = mid - 1;
                    }
                }
                sb.append(count - i + " ");
            }
            else {
                sb.append(count + " ");
            }
        }
        sb.append("0");
        System.out.println(sb.toString());
    }
}
