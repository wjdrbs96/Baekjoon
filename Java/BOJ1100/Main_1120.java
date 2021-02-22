package Baekjoon.Java.BOJ1100;

import java.util.*;

public class Main_1120 {
    static List<Integer> listCount = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String ab = input.nextLine();

        String[] list = ab.split(" ");

        for (int i = 0; i < list[0].length(); ++i) {
            for (int j = 0; j < list[1].length() - list[0].length() + 1; ++j) {
                stringDiffCount(list[0], list[1].substring(j, j + list[0].length()));
            }
        }

        System.out.println(Collections.min(listCount));
    }

    static void stringDiffCount(String a, String b) {
        if (a.length() != b.length()) {
            return;
        }

        int count = 0;
        for (int i = 0; i < a.length(); ++i) {
            if (a.charAt(i) != b.charAt(i)) {
                count++;
            }
        }
        listCount.add(count);
    }
}
