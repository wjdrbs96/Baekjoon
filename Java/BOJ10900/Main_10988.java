package Baekjoon.Java.BOJ10900;

import java.util.Scanner;

public class Main_10988 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.next();

        String name = "";

        for (int i = s.length() - 1; i >= 0; --i) {
            name += String.valueOf(s.charAt(i));
        }

        if (s.equals(name)) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}
