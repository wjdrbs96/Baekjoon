package Baekjoon.Java.BOJ10000;

import java.util.Scanner;

public class Main_10039 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 5; ++i) {
            int n = input.nextInt();
            if (n < 40) {
                n = 40;
            }
            sum += n;
        }

        System.out.println(sum / 5);
    }
}
