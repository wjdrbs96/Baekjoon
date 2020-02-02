package Baekjoon.Java.BOJ11600;

import java.util.Arrays;
import java.util.Scanner;

public class Main_11656 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();

        String[] a = new String[s.length()];

        for (int i = 0; i < s.length(); ++i) {
            a[i] = s.substring(i);
        }

        Arrays.sort(a);

        for (String k : a) {
            System.out.println(k);
        }
    }
}
