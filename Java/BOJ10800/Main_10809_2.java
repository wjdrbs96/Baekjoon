package Baekjoon.Java.BOJ10800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * created by Gyunny 2021/10/28
 */
public class Main_10809_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();

        Map<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < S.length(); ++i) {
            hm.putIfAbsent(S.charAt(i), i);
        }

        for (int i = 97; i <= 122; ++i) {
            if (hm.get((char)i) == null) {
                System.out.print("-1" + " ");
            } else {
                System.out.print(hm.get((char)i) + " ");
            }
        }

    }
}
