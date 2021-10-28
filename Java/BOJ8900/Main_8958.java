package Baekjoon.Java.BOJ8900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] list = new String[n];

        for (int i = 0; i < n; ++i) {
            list[i] = br.readLine();
        }


        for (int j = 0; j < list.length; ++j) {
            int count = 0;
            int sum = 0;
            for (int k = 0; k < list[j].length(); ++k) {
                if (list[j].charAt(k) == 'O') {
                    count++;
                    sum += count;
                } else {
                    count = 0;
                }
            }

            System.out.println(sum);
        }
    }
}
