package Baekjoon.Java.BOJ1100;

import java.util.Scanner;

public class Main_1157 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next().toUpperCase();

        int[] count = new int[26];
        int max = 0;
        char result = '?';

        for (int i = 0; i < s.length(); ++i) {
            count[s.charAt(i) - 65]++;
            if (max < count[s.charAt(i) - 65]) {
                max = count[s.charAt(i) - 65];
                result = s.charAt(i);
            } else if (max == count[s.charAt(i) - 65]) {
                result = '?';
            }
        }
        System.out.println(result);
    }
}
