package Baekjoon.Java.BOJ10800;

import java.util.Scanner;

public class Main_10872 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;
        int temp = 1;
        number = sc.nextInt();

        for (int i = number; i > 0; i--) {
            temp = temp * i;

        }

        System.out.println(temp);
    }
}