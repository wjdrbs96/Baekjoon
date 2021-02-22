package Baekjoon.Java.BOJ2300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_2309_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] list = new int[10];
        int total = 0;

        for (int i = 1; i < 10; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            list[i] = Integer.parseInt(st.nextToken());
            total += list[i];
        }


        Arrays.sort(list);

        int i, j = 0;
        out:
        for (i = 1; i < list.length - 1; ++i) {
            for (j = i + 1; j < list.length; ++j) {
                int sum = total;
                sum -= (list[i] + list[j]);
                if (sum == 100) {
                    break out;
                }
            }
        }

        for (int k = 1; k < list.length; k++) {
            if (k == i || k == j) continue;
            System.out.println(list[k]);
        }
    }
}
