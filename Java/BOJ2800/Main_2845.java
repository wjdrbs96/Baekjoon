package Baekjoon.Java.BOJ2800;

import java.util.Scanner;

public class Main_2845 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int L = input.nextInt();
        int P = input.nextInt();
        int[] list = new int[5];

        for (int i = 0; i < 5; ++i) {
            list[i] = input.nextInt();
        }

        for (int i = 0; i < 5; ++i) {
            System.out.print(list[i] - L * P + " ");
        }
    }
}
