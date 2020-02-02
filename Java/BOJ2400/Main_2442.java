package Baekjoon.Java.BOJ2400;

import java.util.Scanner;

public class Main_2442 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();

        for(int i = 1; i <= N ; i++) {
            for(int j = 0; j < N-i; j++)
                System.out.print(" ");
            for(int j = 0; j < i*2-1; j++)
                System.out.print("*");
            System.out.println();
        }

    }
}