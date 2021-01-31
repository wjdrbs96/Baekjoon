package Baekjoon.Java.BOJ1900;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main_1920_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        Map<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < N; ++i) {
            hm.put(input.nextInt(), i + 1);
        }

        int M = input.nextInt();

        for (int i = 0; i < M; ++i) {
            if (hm.get(input.nextInt()) == null) {
                System.out.println(0);
            }
            else {
                System.out.println(1);
            }
        }
    }
}
