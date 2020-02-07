package Baekjoon.Java.BOJ2800;

import java.util.Scanner;

public class Main_2839 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;

        int n = input.nextInt();

        while(true) {
            if (n % 5 == 0) {
                System.out.println(n / 5 + count);
                break;
            } else if (n <= 0) {
                System.out.println(-1);
                break;
            }
            n = n - 3;
            count++;
        }

    }
}
