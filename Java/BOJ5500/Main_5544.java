package Baekjoon.Java.BOJ5500;

import java.util.*;

public class Main_5544 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int total = n * (n - 1) / 2;
        Map<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < n; ++i) {
            hm.put(i + 1, 0);
        }

        for (int i = 0; i < total; ++i) {
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int num1Score = input.nextInt();
            int num2Score = input.nextInt();

            if (num1Score < num2Score) {
                hm.put(num1, hm.get(num1));
                hm.put(num2, hm.get(num2) + 3);
            } else if (num1Score == num2Score) {
                hm.put(num1, hm.get(num1) + 1);
                hm.put(num2, hm.get(num2) + 1);
            } else {
                hm.put(num1, hm.get(num1) + 3);
                hm.put(num2, hm.get(num2));
            }
        }

        int[] rank = new int[n];
        int[] list = new int[n];

        for (int i = 0; i < rank.length; ++i) {
            rank[i] = 1;
        }

        for (int i = 0; i < n; ++i) {
            list[i] = hm.get(i + 1);
        }

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (list[i] < list[j]) {
                    rank[i] = rank[i] + 1;
                }
            }
        }

        for (int i = 0; i < n; ++i) {
            System.out.println(rank[i]);
        }

    }
}
