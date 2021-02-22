package Baekjoon.Java.BOJ2700;

import java.util.Scanner;

public class Main_2753 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        if (n % 4 == 0 && n % 100 != 0 || n % 400 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
