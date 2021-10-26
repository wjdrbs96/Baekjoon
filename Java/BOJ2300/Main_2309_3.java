package Baekjoon.Java.BOJ2300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * created by Gyunny 2021/10/26
 */
public class Main_2309_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] list = new int[9];

        for (int i = 0; i < 9; ++i) {
            list[i] = Integer.parseInt(br.readLine());
        }

        int sum = 0;
        for (int i = 0; i < 9; ++i) {
            sum += list[i];
        }

        int exceptA = 0;
        int exceptB = 0;
        out:for (int i = 0; i < list.length - 1; ++i) {
            for (int j = i + 1; j < list.length; ++j) {
                if (sum - list[i] - list[j] == 100) {
                    exceptA = list[i];
                    exceptB = list[j];
                    break out;
                }
            }
        }

        Arrays.sort(list);

        for (int i = 0; i < list.length; ++i) {
            if (list[i] != exceptA && list[i] != exceptB) {
                System.out.println(list[i]);
            }
        }

    }
}
