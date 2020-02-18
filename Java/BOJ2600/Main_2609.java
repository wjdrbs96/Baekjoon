package Baekjoon.Java.BOJ2600;

import java.util.Scanner;

public class Main_2609 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        int gcd = GCD(a, b);
        System.out.println(gcd);
        System.out.println(a * b / gcd);
    }

    public static int GCD(int a, int b) {
        if (a % b == 0) {
            return b;
        }

        return GCD(b, a % b);
    }
}
