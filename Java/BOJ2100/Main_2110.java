package Baekjoon.Java.BOJ2100;

import java.util.Arrays;
import java.util.Scanner;

public class Main_2110 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();  // 집의 개수
        int C = input.nextInt();  // 공유기의 개수
        int[] homeList = new int[N + 1];

        Arrays.sort(homeList);

        for (int i = 1; i <= N; ++i) {
            homeList[i] = input.nextInt();
        }


    }
}
