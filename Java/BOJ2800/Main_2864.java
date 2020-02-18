package Baekjoon.Java.BOJ2800;

import java.util.Scanner;

public class Main_2864 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String a = input.next();
        String b = input.next();

        String MinA = a.replace('6', '5');
        String MinB = b.replace('6','5');

        System.out.println(Integer.parseInt(MinA) + Integer.parseInt(MinB));

        String MaxA = a.replace('5','6');
        String MaxB = b.replace('5','6');

        System.out.print(Integer.parseInt(MaxA) + Integer.parseInt(MaxB) + " ");

    }
}
