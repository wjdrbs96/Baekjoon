package Baekjoon.Java.BOJ2500;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main_2562 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 9; ++i) {
            list.add(input.nextInt());
        }

        System.out.println(Collections.max(list));
        System.out.println(list.indexOf(Collections.max(list)) + 1);
    }
}
