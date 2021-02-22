package Baekjoon.Java.BOJ2500;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main_2576 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int sum = 0;
        for (int i = 0; i < 7; ++i) {
            int a = input.nextInt();

            if (a % 2 == 1) {
                sum += a;
                list.add(a);
            }
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(Collections.min(list));
        }
    }
}
