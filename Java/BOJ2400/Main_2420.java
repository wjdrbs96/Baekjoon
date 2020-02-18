package Baekjoon.Java.BOJ2400;

import java.util.Scanner;

public class Main_2420 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long N = input.nextInt();
        long M = input.nextInt();

        System.out.println(Math.abs(N - M));
    }
}
