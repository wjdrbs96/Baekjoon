package Baekjoon.Java.BOJ11600;

import java.util.Arrays;
import java.util.Scanner;

public class Main_11650 implements Comparable{
    int x;
    int y;

    public Main_11650(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public int compareTo(Object o) {
        Main_11650 m = (Main_11650)o;
        if (this.x == m.x) {
            return this.y - m.y;
        }

        else {
            return this.x - m.x;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Main_11650[] list = new Main_11650[n];

        for (int i = 0; i < n; ++i) {
            list[i] = new Main_11650(input.nextInt(),input.nextInt());
        }

        Arrays.sort(list);

        for (Main_11650 s : list) {
            System.out.println(s.x + " " + s.y);
        }

    }
}
