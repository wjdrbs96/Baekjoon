package Baekjoon.Java.BOJ3000;

import java.util.HashSet;
import java.util.Scanner;

public class Main_3052 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = new int[10];
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < 10; ++i) {
            list[i] = input.nextInt();
            hs.add(list[i] % 42);
        }

        System.out.println(hs.size());
    }
}
