package Baekjoon.Java.BOJ5500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * created by jg 2021/05/04
 */
public class Main_5568 {
    private static int N, K;
    private static Set<String> set = new HashSet<>();
    private static StringBuilder sb = new StringBuilder();
    private static boolean[] visit;
    private static int[] list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        K = Integer.parseInt(br.readLine());

        list = new int[N];
        visit = new boolean[N];
        for (int i = 0; i < N; ++i) {
            list[i] = Integer.parseInt(br.readLine());
        }

        backtracking(0);
        System.out.println(set.size());
    }

    private static void backtracking(int depth) {
        if (depth == K) {
            set.add(sb.toString());
            return;
        }

        for (int i = 0; i < N; ++i) {
            if (!visit[i]) {
                sb.append(list[i]);
                visit[i] = true;
                backtracking(depth + 1);
                sb.delete(sb.length() - String.valueOf(list[i]).length(), sb.length());
                visit[i] = false;
            }
        }
    }
}
