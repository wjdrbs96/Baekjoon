package Baekjoon.Java.BOJ2000;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main_2002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        Map<String, Integer> hm = new HashMap<>();

        for (int i = 1; i < N + 1; ++i) {
            hm.put(input.next(), i);
        }

        int count = 0;
        int[] list = new int[N + 1];

        for (int i = 1; i < N + 1; i++) {
            list[i] = hm.get(input.next());
        }

        for (int i = 1; i < N; ++i) {
            for (int j = i + 1; j < N + 1; ++j) {
                if (list[i] > list[j]) {
                    count++;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}
