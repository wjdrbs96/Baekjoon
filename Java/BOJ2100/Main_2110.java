package Baekjoon.Java.BOJ2100;

import java.util.Arrays;
import java.util.Scanner;

public class Main_2110 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();  // 집의 개수
        int C = input.nextInt();  // 공유기의 개수
        int[] homeList = new int[N + 1];

        for (int i = 1; i <= N; ++i) {
            homeList[i] = input.nextInt();
        }

        Arrays.sort(homeList);   // 정렬

        int maxResult = 0;

        int left = 1;
        int right = homeList[N] - homeList[1];
        int d = 0;
        int ans = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            int start = homeList[1];
            int count = 1;  // 공유기 설치 GAP 저장
            for (int i = 1; i <= N; ++i) {
                d = homeList[i] - start;
                if (d >= mid) {
                    count++;
                    start = homeList[i];
                }
            }

            if (count >= C) {
                ans = mid;
                left = mid + 1;  // 더 많은 Gap에서 공유기 설치할 수 있는지 여부 확인
            } else {
                right = mid - 1; // 더 적은 Gap에서 공유기 설치할 수 있는지 여부 확인
            }
        }

        System.out.println(ans);
    }
}
