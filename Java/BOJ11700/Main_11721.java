package Baekjoon.Java.BOJ11700;

import java.util.Scanner;

public class Main_11721 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.next();

        int len = s.length() / 10;

        int i = 0;
        while (len-- > 0) {
            System.out.println(s.substring(i, i + 10));
            i += 10;
        }

        if (s.length() % 10 > 0) {
            System.out.println(s.substring(i));
        }


    }
}
