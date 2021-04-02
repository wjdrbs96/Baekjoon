package Baekjoon.Java.BOJ2500;

import java.util.Arrays;
import java.util.Scanner;

/**
 * created by jg 2021/04/02
 */
public class Main_2512 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        int[] list = new int[N];
        for (int i = 0; i < N; ++i) {
            list[i] = input.nextInt();
        }

        int money = input.nextInt();
        Arrays.sort(list);

        int left = 1;
        int right = list[list.length - 1];

        int result = 0;
        while (left <= right) {
            int mid = (left + right) / 2;

            int sum = 0;
            for (int i = 0; i < N; ++i) {
                if (mid < list[i]) {
                    sum += mid;
                }
                else {
                    sum += list[i];
                }
            }

            // 가능한 범위
            if (money >= sum) {
                left = mid + 1;
                result = mid;
            }
            else {
                right = mid - 1;
            }
        }

        System.out.println(result);
    }
}
