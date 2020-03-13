package Baekjoon.Java.BOJ2800;

import java.util.Scanner;

public class Main_2875 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int M = input.nextInt();
        int K = input.nextInt();

        int sum = 0;

        while (N >= 2 && M >= 1 && N + M >= 3 + K) {
            N -= 2;
            M--;
            sum++;
        }

        System.out.println(sum);
    }
}
