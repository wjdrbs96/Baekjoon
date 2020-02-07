package Baekjoon.Java.BOJ5500;

import java.util.Scanner;

public class Main_5596 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum1 = 0;
        for (int i = 0; i < 4; ++i) {
            sum1 += input.nextInt();
        }

        int sum = 0;
        for (int j = 0; j < 4; ++j) {
            sum += input.nextInt();
        }

        if (sum1 == sum) {
            System.out.println(sum1);
        } else if (sum1 > sum) {
            System.out.println(sum1);
        } else {
            System.out.println(sum);
        }
    }
}
