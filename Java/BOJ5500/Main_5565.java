package Baekjoon.Java.BOJ5500;

import java.util.Scanner;

public class Main_5565 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = input.nextInt();
        int sum = 0;
        for (int i = 0; i < 9; ++i) {
            sum += input.nextInt();
        }

        System.out.println(total - sum);


    }
}
