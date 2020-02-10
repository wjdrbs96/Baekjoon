package Baekjoon.Java.BOJ2600;

import java.util.Scanner;

public class Main_2630 {
    static boolean board[][];
    static int white;
    static int blue;

    public static void Divide(int x, int y, int n) {
        if (n == 1) {
            if (board[y][x]) {
                blue++;
            } else {
                white++;
            }
            return;
        }

        boolean sameColor = true;
        boolean color = board[y][x];

        out:
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (board[y + i][x + j] != color) {
                    sameColor = false;
                    break out;
                }
            }
        }

        if (sameColor) {
            if (board[y][x]) {
                blue++;
            } else {
                white++;
            }
            return;
        }

        int newN = n / 2;
        Divide(x, y, newN);
        Divide(x + newN, y, newN);
        Divide(x, y + newN, newN);
        Divide(x + newN, y + newN, newN);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        board = new boolean[n][n];

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                int a = input.nextInt();
                if (a == 1) board[i][j] = true;
            }
        }

        Divide(0, 0, n);
        System.out.println(white);
        System.out.println(blue);


    }
}
