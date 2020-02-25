package Baekjoon.Java.BOJ4900;

import java.util.Scanner;

public class Main_4999 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String my = input.next();
        String doc = input.next();

        if (my.length() < doc.length()) {
            System.out.println("no");
        } else {
            System.out.println("go");
        }
    }
}
