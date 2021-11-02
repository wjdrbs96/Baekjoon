package Baekjoon.Java.BOJ1700;

import java.util.Scanner;

public class Main_1789 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long num = scan.nextLong();
        long sum = 0;

        int i = 0;
        while (true) {
            sum += i;
            if (sum > num) {
                break;
            }
            i++;
        }
        System.out.println(i - 1);
    }
}
