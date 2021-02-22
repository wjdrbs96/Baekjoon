package Baekjoon.Java.BOJ2400;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main_2455 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] list = new int[4][2];
        List<Integer> save = new ArrayList<>();

        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 2; ++j) {
                list[i][j] = input.nextInt();
            }
        }

        int sum = 0;
        for (int i = 0; i < 4; ++i) {
            sum += list[i][1] - list[i][0];
            save.add(sum);
        }

        Collections.sort(save);
        System.out.println(save.get(save.size() - 1));
    }
}
