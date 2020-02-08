package Baekjoon.Java.BOJ1100;

import java.util.Scanner;

public class Main_1100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[][] list = new char[8][8];


        for (int i = 0; i < 8; ++i) {
            String s = input.nextLine();
            for (int j = 0; j < 8; ++j) {
                list[i][j] = s.charAt(j);
            }
        }

        int count = 0;
        for (int i = 0; i < 8; ++i) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0 && j % 2 == 0 && list[i][j] == 'F') {
                    count++;
                } else if (i % 2 == 1 && j % 2 == 1 && list[i][j] == 'F') {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
