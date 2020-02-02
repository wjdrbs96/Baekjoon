package Baekjoon.Java.BOJ1400;

import java.util.Arrays;
import java.util.Scanner;

public class Main_1427 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.next();
        char[] list = new char[s.length()];

        for (int i = 0; i < s.length(); ++i) {
            list[i] = s.charAt(i);
        }

        Arrays.sort(list);

        for (int i = list.length-1; i >=0; --i) {
            System.out.print((list[i]));
        }
    }
}
