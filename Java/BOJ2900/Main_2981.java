package Baekjoon.Java.BOJ2900;

import java.util.*;

public class Main_2981 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();

        int N = input.nextInt();
        int[] list = new int[N];

        for (int i = 0; i < N; ++i) {
            list[i] = input.nextInt();
        }

        int i = 2;

        while (i <= list[list.length - 1]) {
            for (int k = 0; k < N; ++k) {
                set.add(list[k] % i);
            }
            if (set.size() == 1) {
                System.out.print(i + " ");
            }
            set.clear();
            i++;
        }


    }
}
