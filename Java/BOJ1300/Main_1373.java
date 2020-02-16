package Baekjoon.Java.BOJ1300;
/*

import java.util.Scanner;

public class Main_1373 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();

        int sum = 0;
        int result = 1;
        for (int i = s.length() - 1; i >= 0; --i) {
            sum += result * Integer.parseInt(String.valueOf(s.charAt(i)));
            result *= 2;
        }

        int a = sum;
        StringBuilder sb = new StringBuilder();
        while (true) {
                if (a < 8) {
                break;
            }
            sb.append(a % 8);
            a = a / 8;
        }

        sb.append(a);
        sb.reverse();
        System.out.println(sb.toString());

    }
}
*/

import java.util.*;

public class Main_1373 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        if (n % 3 == 1) {
            System.out.print(s.charAt(0));
        } else if (n % 3 == 2) {
            System.out.print((s.charAt(0)-'0')*2 + (s.charAt(1)-'0'));
        }
        for (int i=n % 3; i < n; i+=3) {
            System.out.print((s.charAt(i) - '0') * 4 + (s.charAt(i + 1) - '0') * 2 + (s.charAt(i + 2) - '0'));
        }
        System.out.println();
    }
}
