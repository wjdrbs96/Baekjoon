package Baekjoon.Java.BOJ1500;

import java.util.Scanner;

public class Main_1543 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String a = input.nextLine();
        String b = input.nextLine();
        int count = 0;

        a = a.replace(" ", "");
        b = b.replace(" ", "");

        for (int i = 0; i < a.length() - b.length() + 1; ++i) {
            if (a.substring(i, b.length() + i).equals(b)) {
                i += (b.length() - 1);
                count++;
            }
        }

        System.out.println(count);
    }
}
