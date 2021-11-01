package Baekjoon.Java.BOJ1100;

import java.util.Scanner;

public class Main_1152 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();
        String[] p = s.split(" ");

        int count = 0;
        for (int i = 0; i < p.length; ++i) {
            if (!p[i].equals("")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
