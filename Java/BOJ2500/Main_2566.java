package Baekjoon.Java.BOJ2500;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main_2566 {
    int i;
    int j;

    public Main_2566(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] list = new int[10][10];
        Map<Integer, Main_2566> hm = new HashMap<>();

        for (int i = 1; i < 10; ++i) {
            for (int j = 1; j < 10; ++j) {
                list[i][j] = input.nextInt();
            }
        }

        int max = list[1][1];
        for (int i = 1; i < 10; ++i) {
            for (int j = 1; j < 10; ++j) {
                if (max < list[i][j]) {
                    max = list[i][j];
                    hm.put(max, new Main_2566(i, j));
                }
            }
        }

        System.out.println(max);
        System.out.println(hm.get(max).i + " " + hm.get(max).j);

    }
}
