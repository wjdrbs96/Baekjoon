package Baekjoon.Java.BOJ2300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * created by Gyunny 2021/11/02
 */
public class Main_2309_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] list = new int[9];

        int sum = 0;
        for (int i = 0; i < 9; ++i) {
            list[i] = Integer.parseInt(br.readLine());
            sum += list[i];
        }

        Arrays.sort(list);

        int a = 0, b = 0;
        out:for (int i = 0; i < list.length; ++i) {
            for (int j = i + 1; j < list.length; ++j) {
                if (sum - list[i] - list[j] == 100) {
                    a = list[i];
                    b = list[j];
                    break out;
                }
            }
        }

        for (int k : list) {
            if (k != a && k != b) {
                System.out.println(k);
            }
        }
    }
}
