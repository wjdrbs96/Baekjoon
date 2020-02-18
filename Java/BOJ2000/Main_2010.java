package Baekjoon.Java.BOJ2000;

import java.util.Scanner;

public class Main_2010 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int sum = 0;

        for (int i = 0; i < N; ++i) {
            int num = input.nextInt();
            sum += num;
        }

        System.out.println(sum - (N - 1));
    }
}
