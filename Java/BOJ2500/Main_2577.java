package Baekjoon.Java.BOJ2500;

import java.util.Scanner;

public class Main_2577 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = new int[10];

        long sum = 1;

        for (int i = 0; i < 3; ++i) {
            sum *= input.nextInt();
        }

        String s = String.valueOf(sum);

        for (int i = 0; i < s.length(); ++i) {
            list[s.charAt(i) - 48] += 1;
        }

        for (int i = 0; i < 10; ++i) {
            System.out.println(list[i]);
        }

    }
}
