package Baekjoon.Java.BOJ1000;


import java.util.Scanner;

public class Main_1094 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;
        int len = 64;
        int cnt = 0;
        int end = num;
        while (true) {
            if (num == 64) {
                cnt++;
                break;
            }
            len = len / 2;

            if (num >= len) {
                result += len;
                cnt++;
                if (end == result) {
                    break;
                }
                num = num - len;
            }
        }
        System.out.println(cnt);
    }

}