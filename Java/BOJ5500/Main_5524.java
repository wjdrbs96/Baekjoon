package Baekjoon.Java.BOJ5500;

import java.util.Scanner;

public class Main_5524 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 0; i < n; ++i) {
            String name = input.next();
            System.out.println(name.toLowerCase());
        }
    }
}
