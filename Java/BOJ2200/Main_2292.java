package Baekjoon.Java.BOJ2200;

import java.util.Scanner;

public class Main_2292 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int result = 1;
        int count = 1;
        int addNum = 6;

        while(true) {
            if (n <= count) {
                break;
            }

            count += addNum;
            addNum += 6;
            result++;
        }

        System.out.println(result);
    }
}
