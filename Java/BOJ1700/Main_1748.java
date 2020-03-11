package Baekjoon.Java.BOJ1700;

import java.util.Scanner;

public class Main_1748 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        // 메모리 초과 코드
        /*int count = 0;

        for (int i = 1; i <= N; ++i) {
            count += String.valueOf(i).length();
        }

        System.out.println(count);*/

        int cnt = 1;
        int temp = 0;
        int len = 10;

        for (int i = 1; i <= N; ++i) {
            if (i == len) {
                cnt++;
                len *= 10;
            }
            temp += cnt;
        }

        System.out.println(temp);
    }
}
