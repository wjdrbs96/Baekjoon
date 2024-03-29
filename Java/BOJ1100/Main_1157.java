package Baekjoon.Java.BOJ1100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * created by Gyunny 2021/11/01
 */
public class Main_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine().toLowerCase();

        int[] alPha = new int[26];
        int max = 0;
        char result = '?';

        for (int i = 0; i < s.length(); ++i) {
            int count = alPha[s.charAt(i) - 97]++;
            if (max < count) {
                max = count;
                result = s.charAt(i);
            } else if (max == count) {
                result = '?';
            }
        }

        System.out.println(String.valueOf(result).toUpperCase());
    }
}
