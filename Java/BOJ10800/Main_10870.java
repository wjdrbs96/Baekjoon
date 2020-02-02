package Baekjoon.Java.BOJ10800;

import java.util.Scanner;

public class Main_10870 {

    public static int fibo(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fibo(n - 1) + fibo(n - 2);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        System.out.println(fibo(n));
    }
}
