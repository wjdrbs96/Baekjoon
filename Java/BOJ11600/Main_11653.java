package Baekjoon.Java.BOJ11600;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_11653 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        int N = input.nextInt();

        while (true) {
            if (N == 1) break;
            for (int i = 2; i <= N; ++i) {
                if (N % i == 0) {
                    N = N / i;
                    list.add(i);
                    break;
                }
            }
        }

        for (int i : list) {
            System.out.println(i);
        }


    }
}
