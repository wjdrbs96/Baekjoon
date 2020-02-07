package Baekjoon.Java.BOJ1700;

import java.util.Scanner;

public class Main_1712 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B =input.nextInt();
        int C =input.nextInt();

        if (B >= C) {
            System.out.println(-1);
        } else {
            System.out.println(A / (C - B) + 1);
        }
    }
}
