package Baekjoon.Java.BOJ1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 1; i <= n; ++i) {
            String s = String.valueOf(i);
            if (s.length() < 3) {
                count++;
                continue;
            }

            if (s.length() == 3) {
                int a = s.charAt(1) - s.charAt(0);
                int b = s.charAt(2) - s.charAt(1);
                if (a == b) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
