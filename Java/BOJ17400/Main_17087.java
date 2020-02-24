package Baekjoon.Java.BOJ17400;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_17087 {
    static int GCD(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return GCD(n2, n1 % n2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int N = input.nextInt();
        int S = input.nextInt();


        for (int i = 0; i < N; ++i) {
            int a = input.nextInt();
            list.add(Math.abs(S - a));
        }

        int gcd = list.get(0);
        for (int i = 1; i < list.size(); ++i) {
            gcd = GCD(gcd, list.get(i));
        }

        System.out.println(gcd);


    }
}
