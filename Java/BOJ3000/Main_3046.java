package Baekjoon.Java.BOJ3000;

import java.util.Scanner;

public class Main_3046 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int R1 = input.nextInt();
        int s = input.nextInt();
        int R2 = s * 2 - R1;
        System.out.println(R2);
    }
}
