package Baekjoon.Java.BOJ10800;

import java.util.Scanner;

public class Main_10809 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int[] list = new int[26];
        char[] alpha = new char[26];

        for (int i = 0; i < 26; ++i) {
            list[i] = -1;
            alpha[i] = (char)(97 + i);
        }

        for (int j = 0; j < s.length(); ++j) {
            for (int k = 0; k < 26; ++k) {
                if (s.charAt(j) == alpha[k] && list[k] == -1) {
                    list[k] = j;
                    break;
                }
            }
        }

        for (int q : list) {
            System.out.print(q + " ");
    }
    }
}
