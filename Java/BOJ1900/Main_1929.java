package Baekjoon.Java.BOJ1900;

import java.util.Scanner;

public class Main_1929 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        for (int i = a; i <=b; ++i) {
            if (isprime(i)) {
                System.out.println(i);
            }
        }

    }
    static boolean isprime(int num) {
        if (num == 1) {
            return false;
        }

        int n = (int)Math.floor(Math.sqrt(num));

        for (int k = 2; k < n + 1; ++k) {
            if (num % k == 0) {
                return false;
            }
        }
        return true;

    }
}
