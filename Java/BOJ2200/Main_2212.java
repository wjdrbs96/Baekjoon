package Baekjoon.Java.BOJ2200;

import java.util.Arrays;
import java.util.Scanner;

public class Main_2212 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();  // 센서 수
        int K = input.nextInt();  // 기지국 수
        int[] list = new int[N + 1];

        for (int i = 1; i < N + 1; ++i) {
            list[i] = input.nextInt();
        }

        Arrays.sort(list);

        int countK = 0; // 가능한 기지국 수 카운트

        for (int i = 1; i < list.length; ++i) {

        }

    }
}
