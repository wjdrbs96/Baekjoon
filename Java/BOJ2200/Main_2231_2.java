package Baekjoon.Java.BOJ2200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * created by Gyunny 2021/11/02
 */
public class Main_2231_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        int p = 1;
        boolean check = false;
        while (p < N) {
            sum = 0;
            String s = String.valueOf(p);
            for (int i = 0; i < s.length(); ++i) {
                sum += Integer.parseInt(String.valueOf(s.charAt(i)));
            }

            if (p + sum == N) {
                check = true;
                break;
            }
            p++;
        }

        if (check) {
            System.out.println(p);
        } else {
            System.out.println(0);
        }
    }
}
