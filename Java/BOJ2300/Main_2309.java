package Baekjoon.Java.BOJ2300;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main_2309 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int[] result = new int[9];

        int sum = 0;
        for (int i = 0; i < 9; ++i) {
            list.add(input.nextInt());
            sum += list.get(i);
        }

        Collections.sort(list);

        for (int i = 0; i < 9; ++i) {
            for (int j = i + 1; j < 9; ++j) {
                if (sum - list.get(i) - list.get(j) == 100) {
                    for (int k = 0; k < 9; ++k) {
                        if (i == k || j == k) {
                            continue;
                        }
                        System.out.println(list.get(k));
                    }
                    return;
                }
            }
        }


    }
}
