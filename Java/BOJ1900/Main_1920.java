package Baekjoon.Java.BOJ1900;

import java.util.*;

public class Main_1920 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int[] list = new int[N];

        for (int i = 0; i < N; ++i) {
            list[i] = input.nextInt();
        }

        Arrays.sort(list);
        int M = input.nextInt();

        for (int i = 0; i < M; ++i) {
            if (Arrays.binarySearch(list, input.nextInt()) >= 0) {
                System.out.println(1);
            }
            else {
                System.out.println(0);
            }

        }
    }
}
