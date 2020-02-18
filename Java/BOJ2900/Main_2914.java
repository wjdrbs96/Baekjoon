package Baekjoon.Java.BOJ2900;

import java.util.Scanner;

public class Main_2914 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double A = input.nextDouble();
        double i = input.nextDouble();

        double total = A * (i - 1);

        while (true) {
            if (Math.ceil(total / A) == i) {
                System.out.println((int)total);
                break;
            }
            total++;
        }


    }
}
