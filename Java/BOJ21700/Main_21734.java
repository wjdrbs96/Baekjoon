package Baekjoon.Java.BOJ21700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * created by jg 2021/05/23
 */
public class Main_21734 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < S.length(); ++i) {
            int sum = 0;
            int a = S.charAt(i);
            String s = String.valueOf(a);
            for (int j = 0; j < s.length(); ++j) {
                sum += Integer.parseInt(String.valueOf(s.charAt(j)));
            }
            for (int k = 0; k < sum; ++k) {
                sb.append(S.charAt(i));
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
