package Baekjoon.Java.BOJ2700;

import java.util.Scanner;

public class Main_2789 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = "CAMBRIDGE";

        String[] s = input.next().split("");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length; ++i) {
            if (word.contains(s[i])) {
                continue;
            }
            sb.append(s[i]);
        }

        System.out.println(sb.toString());

    }
}
