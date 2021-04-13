package Baekjoon.Java.BOJ15600;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_15651 {
    private static int N, M;
    private static StringBuilder sb = new StringBuilder();
    private static StringBuilder sb1 = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        combination(0);
        System.out.println(sb1);
    }

    private static void combination(int depth) {
        if (depth == M) {
            sb1.append(sb).append("\n");
            return;
        }

        for (int i = 1; i <= N; ++i) {
            sb.append(i).append(" ");
            combination(depth + 1);
            sb.delete(sb.length() - 2, sb.length());
        }
    }
}
