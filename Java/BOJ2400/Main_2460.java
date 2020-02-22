package Baekjoon.Java.BOJ2400;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main_2460 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; ++i) {
            int a = input.nextInt();
            int b = input.nextInt();
            sum += b;
            sum -= a;
            list.add(sum);
        }

        System.out.println(Collections.max(list));
    }
}
