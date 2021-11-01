package Baekjoon.Java.BOJ11700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int sum = 0;
        String line = br.readLine();

        for (int i = 0; i < num; i++) {
            sum += line.charAt(i) - '0';
        }

        System.out.println(sum);
    }
}