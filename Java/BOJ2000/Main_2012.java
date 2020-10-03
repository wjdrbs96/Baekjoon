package Baekjoon.Java.BOJ2000;

import java.util.Arrays;
import java.util.Scanner;

public class Main_2012 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int[] list = new int[N + 1];

        for (int i = 1; i < N + 1; ++i) {
            list[i] = input.nextInt();
        }

        Arrays.sort(list);

        long sum = 0;
        for (int i = 1; i < list.length; ++i) {
            sum += Math.abs(list[i] - (i));
        }

        System.out.println(sum);
    }
}
