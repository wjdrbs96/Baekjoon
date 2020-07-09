package Baekjoon.Java.BOJ10800;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main_10818 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; ++i) {
            list.add(input.nextInt());
        }

        System.out.println(Collections.min(list) + " " + Collections.max(list));
    }
}
