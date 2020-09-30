package Baekjoon.Java.BOJ9300;

import java.util.Scanner;

public class Main_9372 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        for (int i = 0; i < t; ++i) {
            int N = input.nextInt();  // 국가 수
            int M = input.nextInt();  // 비행기 종류

            for (int j = 0; j < M; ++j) {
                int a = input.nextInt();
                int b = input.nextInt();
            }

            System.out.println(N - 1);
        }
    }
}
