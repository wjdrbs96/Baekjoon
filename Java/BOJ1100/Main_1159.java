package Baekjoon.Java.BOJ1100;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_1159 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> ary = new ArrayList<>();
        int[] alpa = new int[26];

        int n = input.nextInt();
        char[] list = new char[n];
        String result = "";

        for (int i = 0; i < n; ++i) {
            list[i] = input.next().charAt(0);
            alpa[list[i]-97]++;
        }

        for (int j = 0; j < alpa.length; ++j) {
            if (alpa[j] >= 5) {
                result += (char)(97 + j);
            }
        }

        if (result.equals("")) {
            System.out.println("PREDAJA");
        }

        else {
            System.out.println(result);
        }

    }
}
