package Baekjoon.Java.BOJ10100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * created by jg 2021/04/09
 */
public class Main_10162 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        sb.append(T / 300 + " ");
        T = T % 300;

        sb.append(T / 60 + " ");
        T = T % 60;

        sb.append(T / 10);

        T = T % 10;

        if (T == 0) {
            System.out.println(sb);
        } else {
            System.out.println(-1);
        }
    }
}
