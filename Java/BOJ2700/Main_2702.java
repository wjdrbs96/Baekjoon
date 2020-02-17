package Baekjoon.Java.BOJ2700;

import java.util.Scanner;

public class Main_2702 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int n = input.nextInt();

        for (int i = 0; i < n; ++i) {
            int a = input.nextInt();
            int b = input.nextInt();
            int k = GCD(a, b);
            System.out.print(a * b / k + " ");
            System.out.println(k);
        }

    }

    public static int GCD(int a, int b) {
        if (a % b == 0) {
            return b;
        }

        return GCD(b, a % b);

    }
}
