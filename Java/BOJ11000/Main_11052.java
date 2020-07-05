package Baekjoon.Java.BOJ11000;

import java.util.Scanner;

public class Main_11052 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] d = new int[n + 1];
        int[] arr = new int[n + 1];

        for (int i = 1; i <= n; ++i) {
            arr[i] = input.nextInt();
        }

        // 배열 d에는 가격의 최대값이 들어 있다 (ex : d[2] : 2개의 카드팩을 사기위한 최대값)
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= i; ++j) {
                d[i] = Math.max(d[i], d[i - j] + arr[j]);
            }
        }

        System.out.println(d[n]);
    }
}
