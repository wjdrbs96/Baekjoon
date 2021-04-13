package Baekjoon.Java.BOJ15600;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * created by jg 2021/04/13
 */
public class Main_15652 {
    private static int N, M;
    private static StringBuilder sb = new StringBuilder();
    private static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        combination(0);
        System.out.println(result);
    }

    private static void combination(int depth) {
        if (depth == M) {
            result.append(sb).append("\n");
            return;
        }

        for (int i = 1; i <= N; ++i) {
            if (sb.length() >= 2) {
                if (Integer.parseInt(String.valueOf(sb.charAt(sb.length() - 2))) <= i) {
                    sb.append(i).append(" ");
                    combination(depth + 1);
                    sb.delete(sb.length() - 2, sb.length());
                }
            }
            else {
                sb.append(i).append(" ");
                combination(depth + 1);
                sb.delete(sb.length() - 2, sb.length());
            }
        }
    }
}
