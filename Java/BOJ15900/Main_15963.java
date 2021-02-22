package Baekjoon.Java.BOJ15900;

import java.util.Scanner;

public class Main_15963 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String N = input.next();
        String M = input.next();

        if (N.equals(M)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
