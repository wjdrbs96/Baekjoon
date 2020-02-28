package Baekjoon.Java.BOJ10800;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main_10815 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();

        int n = input.nextInt();

        for (int i = 0; i < n; ++i) {
            set.add(input.nextInt());
        }

        int m = input.nextInt();

        for (int i = 0; i < m; ++i) {
            if (!set.contains(input.nextInt())) {
                System.out.print(0 + " ");
            } else {
                System.out.print(1 + " ");
            }
        }
    }
}
