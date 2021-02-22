package Baekjoon.Java.BOJ1900;

import java.util.*;

public class Main_1920_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < N; ++i) {
            map.put(input.nextInt(), 1);
        }

        int M = input.nextInt();

        for (int i = 0; i < M; ++i) {
            int num = input.nextInt();
            if (map.get(num) != null) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
