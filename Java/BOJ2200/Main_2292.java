package Baekjoon.Java.BOJ2200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int result = 1;
        int count = 1;
        int addNum = 6;

        while (true) {
            if (n <= count) {
                break;
            }

            count += addNum;
            addNum += 6;
            result++;
        }

        System.out.println(result);
    }
}
