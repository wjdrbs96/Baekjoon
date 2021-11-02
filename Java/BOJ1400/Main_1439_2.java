package Baekjoon.Java.BOJ1400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * created by Gyunny 2021/11/02
 */
public class Main_1439_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        String[] list = s.split("");

        int zeroCount = 0;
        int oneCount = 0;
        if (list[0].equals("0")) {
            zeroCount++;
        } else {
            oneCount++;
        }

        for (int i = 1; i < list.length; ++i) {
            if (!list[i - 1].equals(list[i])) {
                if (list[i].equals("0")) {
                    zeroCount++;
                } else {
                    oneCount++;
                }
            }
        }

        System.out.println(Math.min(zeroCount, oneCount));
    }
}
