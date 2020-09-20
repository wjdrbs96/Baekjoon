package Baekjoon.Java.BOJ1600;

import java.util.Scanner;

public class Main_1668 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 트로피 개수
        int n = input.nextInt();
        int[] list = new int[n + 1];

        // 트로피 높이
        for (int i = 1; i <= n; ++i) {
            list[i] = input.nextInt();
        }

        int leftCount = 1;
        int rightCount = 1;
        int maxLeft = list[1];
        int maxRight = list[n];


        for (int i = 1; i < n; ++i) {
            if (maxLeft < list[i + 1]) {
                leftCount++;
                maxLeft = list[i + 1];
            }
        }


        for (int i = n; i > 0; i--) {
            if (maxRight < list[i - 1]) {
                rightCount++;
                maxRight = list[i - 1];
            }
        }

        System.out.println(leftCount);
        System.out.println(rightCount);
    }
}
