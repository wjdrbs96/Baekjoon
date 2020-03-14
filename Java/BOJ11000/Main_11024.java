package Baekjoon.Java.BOJ11000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11024 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();

        int n = Integer.parseInt(N);
        int sum = 0;

        for (int i = 0; i < n; ++i) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            while (st1.hasMoreTokens()) {
                sum += Integer.parseInt(st1.nextToken());
            }
            System.out.println(sum);
            sum = 0;
        }


    }
}
