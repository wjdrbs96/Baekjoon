package Baekjoon.Java.BOJ1500;

import java.util.Scanner;

public class Main_1568 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 0;
        int i = 1;

        while (n > 0) {
            n -= i;
            i++;
            count++;
            if (n < i) {
                i = 1;
            }
        }

        System.out.println(count);
    }
}
