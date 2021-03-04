package Baekjoon.Java.BOJ1000;

import java.util.Scanner;

public class Main_1057 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();  // 토너먼트의 수

        int a = input.nextInt();  // 임한수 번호
        int b = input.nextInt();  // 김지민 번호

        int round = 0;
        while (a != b) {
            a = a / 2 + a % 2;
            b = b / 2 + b % 2;
            round++;
        }

        System.out.println(round);
    }
}
