package Baekjoon.Java.BOJ10900;

import java.util.Scanner;

public class Main_10987 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.next();

        int count = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                count++;
            }
        }

        System.out.println(count);
    }
}
