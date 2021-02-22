package Baekjoon.Java.BOJ10900;

import java.util.Scanner;

public class Main_10952 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            int a = input.nextInt();
            int b = input.nextInt();

            if (a == 0 && b == 0) {
                break;
            }
            System.out.println(a + b);

        }
    }
}
