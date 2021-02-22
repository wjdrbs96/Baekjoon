package Baekjoon.Java.BOJ5600;

import java.util.Scanner;

public class Main_5622 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.next();

        int sum = 0;

        for (int i = 0; i < s.length(); ++i) {
            char a = s.charAt(i);

            if (a == 'A' || a == 'B' || a == 'C') {
                sum += 3;
            } else if (a == 'D' || a == 'E' || a == 'F') {
                sum += 4;
            } else if (a == 'G' || a == 'H' || a == 'I') {
                sum += 5;
            } else if (a == 'J' || a == 'K' || a == 'L') {
                sum += 6;
            } else if (a == 'M' || a == 'N' || a == 'O') {
                sum += 7;
            } else if (a == 'P' || a == 'Q' || a == 'R' || a == 'S') {
                sum += 8;
            } else if (a == 'T' || a == 'U' || a == 'V') {
                sum += 9;
            } else if (a == 'W' || a == 'X' || a == 'Y' || a == 'Z') {
                sum += 10;
            }
        }

        System.out.println(sum);

    }
}
