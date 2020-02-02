package Baekjoon.Java.BOJ10900;

import java.util.Scanner;

public class Main_10953 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        input.nextLine();
        for (int i = 0; i < n; ++i) {
            String s = input.nextLine();
            String[] p = s .split(",");
            int a = Integer.parseInt(p[0]);
            int b = Integer.parseInt(p[1]);
            System.out.println(a+b);
        }
    }
}
