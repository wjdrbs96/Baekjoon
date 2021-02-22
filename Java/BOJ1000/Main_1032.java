package Baekjoon.Java.BOJ1000;

import java.util.Scanner;

public class Main_1032 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        StringBuffer[] list = new StringBuffer[n];

        for (int i = 0; i < n; ++i) {
            list[i] = new StringBuffer(input.next());
        }


        StringBuffer start = list[0];

        for (int j = 1; j < n; ++j) {
            for (int k = 0; k < start.length(); ++k) {
                if (start.charAt(k) == list[j].charAt(k)) {
                    continue;
                } else {
                    start.replace(k, k + 1, "?");
                }
            }
        }

        System.out.println(start.toString());
    }
}
