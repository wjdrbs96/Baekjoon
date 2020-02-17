package Baekjoon.Java.BOJ2700;

import java.util.Scanner;

public class Main_2720 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] count = new int[4];

        for (int i = 0; i < n; ++i) {
            int a = input.nextInt();
            if (a >= 25) {
                count[0] = a / 25;
                a = a - 25 * count[0];
            }
            if (a >= 10) {
                count[1] = a / 10;
                a = a - 10 * count[1];
            }
            if (a >= 5) {
                count[2] = a / 5;
                a = a - 5 * count[2];
            }
            count[3] = a;

            for (int j = 0; j < 4; ++j) {
                System.out.print(count[j] + " ");
                count[j] = 0;
            }
            System.out.println();
        }
    }
}
