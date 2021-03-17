package Baekjoon.Java.BOJ1400;

import java.util.Arrays;
import java.util.Scanner;

/**
 * created by jg 2021/03/17
 */
public class Main_1449 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int L = input.nextInt();

        int[] list = new int[N];
        for (int i = 0; i < N; ++i) {
            list[i] = input.nextInt();
        }

        Arrays.sort(list);

        int count = 0;

        int end = -L;
        for (int l : list) {
            if (l >= end + L) {
                end = l;
                count++;
            }
        }

        System.out.println(count);
    }
}
