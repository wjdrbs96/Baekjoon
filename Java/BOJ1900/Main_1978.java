package Baekjoon.Java.BOJ1900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1978 {

    public static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i * i <= n; ++i) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] tmp = br.readLine().split(" ");

        int count = 0;
        for (int i = 0; i < n; ++i) {
            if (isPrime(Integer.parseInt(tmp[i]))) {
                count++;
            }
        }

        System.out.println(count);
    }
}
