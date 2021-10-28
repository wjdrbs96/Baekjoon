package Baekjoon.Java.BOJ4300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int C = Integer.parseInt(br.readLine());  // 테스트 케이스 수

        for (int i = 0; i < C; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());  // 학생 수
            int[] listScore = new int[N];  // 점수
            int sum = 0;  // 점수 합계
            int count = 0; // 평균 넘는 수
            double avg = 0;
            for (int j = 0; j < N; ++j) {
                listScore[j] = Integer.parseInt(st.nextToken());
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
