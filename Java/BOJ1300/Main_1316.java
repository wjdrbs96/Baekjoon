package Baekjoon.Java.BOJ1300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * created by Gyunny 2021/11/01
 */
public class Main_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int count = N;
        for (int i = 0; i < N; ++i) {
            String s = br.readLine();

            for (int j = 1; j < s.length(); ++j) {
                if (s.indexOf(s.charAt(j - 1)) > s.indexOf(s.charAt(j))) {
                    count--;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}
