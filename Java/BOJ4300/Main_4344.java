package Baekjoon.Java.BOJ4300;

import java.util.Scanner;

public class Main_4344 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int C = input.nextInt();  // 테스트 케이스 수


        for (int i = 0; i < C; ++i) {
            int N = input.nextInt();  // 학생 수
            int[] listScore = new int[N];  // 점수
            int sum = 0;  // 점수 합계
            int count = 0; // 평균 넘는 수
            double avg = 0;
            for (int j = 0; j < N; ++j) {
                listScore[j] = input.nextInt();
                sum += listScore[j];
            }
            avg = (double) sum / N;
            for (int k = 0; k < N; ++k) {
                if (listScore[k] > avg) {
                    count++;
                }
            }

            System.out.printf("%.3f", 100.0 * count / N);
            System.out.println("%");
        }
    }
}
