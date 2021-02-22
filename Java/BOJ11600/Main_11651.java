package Baekjoon.Java.BOJ11600;

import java.util.Arrays;
import java.util.Scanner;

public class Main_11651 implements Comparable {
    int x;
    int y;

    public Main_11651(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Object o) {
        Main_11651 m = (Main_11651) o;
        if (this.y == m.y) {
            return this.x - m.x;
        } else {
            return this.y - m.y;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Main_11651[] list = new Main_11651[n];

        for (int i = 0; i < n; ++i) {
            list[i] = new Main_11651(input.nextInt(), input.nextInt());
        }

        Arrays.sort(list);

        for (Main_11651 s : list) {
            System.out.println(s.x + " " + s.y);
        }

    }
}
