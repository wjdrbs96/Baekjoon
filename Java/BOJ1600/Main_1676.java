package Baekjoon.Java.BOJ1600;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int input = 1;
        int five = 0;

        for (int i = 1; i <= n; ++i) {
            input = i;

            while (input % 2 == 0 || input % 5 == 0) {
                if (input % 2 == 0) {
                    input /= 2;
                }

                if (input % 5 == 0) {
                    input /= 5;
                    five++;
                }
            }
        }

        System.out.println(five);


    }
}
