package Baekjoon.Java.BOJ5500;

import java.util.Scanner;

public class Main_5554 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 4; ++i) {
            sum += input.nextInt();
        }

        System.out.println(sum / 60);
        System.out.println(sum % 60);
    }
}
