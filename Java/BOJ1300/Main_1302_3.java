package Baekjoon.Java.BOJ1300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/**
 * created by Gyunny 2021/11/02
 */
public class Main_1302_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] list = new String[N];
        Map<String, Integer> hm = new TreeMap<>();

        for (int i = 0; i < N; ++i) {
            list[i] = br.readLine();
            hm.merge(list[i], 1, Integer::sum);
        }

        int max = 0;
        for (int i = 0; i < N; ++i) {
            max = Math.max(max, hm.get(list[i]));
        }

        Arrays.sort(list);
        for (int i = 0; i < N; ++i) {
            if (hm.get(list[i]) == max) {
                System.out.println(list[i]);
                break;
            }
        }
    }
}
