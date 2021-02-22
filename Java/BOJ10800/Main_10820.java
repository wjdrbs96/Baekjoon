package Baekjoon.Java.BOJ10800;

import java.util.Scanner;

public class Main_10820 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (input.hasNextLine()) {
            String s = input.nextLine();

            int Upper = 0;
            int lower = 0;
            int space = 0;
            int number = 0;
            for (int i = 0; i < s.length(); ++i) {
                if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                    Upper++;
                } else if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                    lower++;
                } else if (s.charAt(i) == ' ') {
                    space++;
                } else if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                    number++;
                }
            }

            System.out.print(lower + " " + Upper + " " + number + " " + space);
            System.out.println();
        }
    }
}
