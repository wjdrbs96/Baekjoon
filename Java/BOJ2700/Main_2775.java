package Baekjoon.Java.BOJ2700;

// 해결 못해서 구글링 했는데 나에게는 쉽지 않은 문제
//만약 2층 2호를 구한다면 2층 2호의 값은 2층 1호의 값과 1층 2호 값을 더한 것이라는 것을 알 수 있다.
//위 개념을 알았다면 풀 수 있었을 텐데 나는 더 어렵게 생각했다.

import java.util.Scanner;

public class Main_2775 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        int[][] apart = new int[15][14];
        for (int i = 0; i < 14; i++) {
            apart[0][i] = i + 1;
        }

        for (int i = 1; i <= 14; i++) {
            for (int j = 0; j < 14; j++) {
                for (int q = 0; q <= j; q++) {
                    apart[i][j] += apart[i - 1][q];
                }
            }
        }
        for (int i = 0; i < T; i++) {
            int k = in.nextInt();
            int n = in.nextInt();

            System.out.println(apart[k][n - 1]);

        }
    }
}