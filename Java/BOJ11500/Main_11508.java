package Baekjoon.Java.BOJ11500;

import java.util.Arrays;
import java.util.Scanner;

// 아 상당히 비효율적으로 푼듯
public class Main_11508 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] list = new int[n + 1];
        int[] list1 = new int[n + 1];

        for (int j = 1; j <= n; ++j) {
            list[j] = input.nextInt();
        }

        Arrays.sort(list);
        int k = 1;
        for (int j = n; j >= 1; --j) {
            list1[k++] = list[j];
        }

        int sum = 0;
        for (int i = 1; i <= n; ++i) {
            if (i % 3 == 0) {
                continue;
            }
            sum += list1[i];

        }
        System.out.println(sum);
    }
}
