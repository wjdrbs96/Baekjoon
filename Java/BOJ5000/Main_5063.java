package Baekjoon.Java.BOJ5000;

import java.util.Scanner;

public class Main_5063 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 0; i < n; ++i) {
            int r = input.nextInt();
            int e = input.nextInt();
            int c = input.nextInt();

            if (r > e - c) {
                System.out.println("do not advertise");
            } else if (r == e - c) {
                System.out.println("does not matter");
            } else  {
                System.out.println("advertise");
            }
        }

    }
}
