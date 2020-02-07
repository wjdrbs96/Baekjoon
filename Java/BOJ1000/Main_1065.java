package Baekjoon.Java.BOJ1000;

import java.util.Scanner;

public class Main_1065 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int count = 0;

        for (int i = 1; i <= n; ++i) {
            String s = String.valueOf(i);
            if (s.length() < 3) {
                count++;
                continue;
            }

            if (s.length() == 3) {
                int a = s.charAt(1) - s.charAt(0);
                int b = s.charAt(2) - s.charAt(1);
                if (a == b) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
