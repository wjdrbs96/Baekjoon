package Baekjoon.Java.BOJ2500;

import java.util.Scanner;

public class Main_2588 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        String b = input.next();

        System.out.println(a * Integer.parseInt(String.valueOf(b.charAt(2))));
        System.out.println(a * Integer.parseInt(String.valueOf(b.charAt(1))));
        System.out.println(a * Integer.parseInt(String.valueOf(b.charAt(0))));
        System.out.println(a * Integer.parseInt(b));

    }
}
