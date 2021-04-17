package Baekjoon.Java.BOJ14800;

/**
 * created by jg 2021/04/18
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * created by jg 2021/04/17
 */
public class Main_14888_2 {
    private static int N;
    private static int[] list;
    private static int[] operation;
    private static boolean[] visit;
    private static StringBuilder sb = new StringBuilder();
    private static int max = Integer.MIN_VALUE;
    private static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        visit = new boolean[N];
        list = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        operation = new int[4];
        for (int i = 0; i < 4; ++i) {
            operation[i] = Integer.parseInt(st.nextToken());
        }

        backTracking(0);
        System.out.println(max);
        System.out.println(min);
    }

    private static void backTracking(int depth) {
        if (depth == N - 1) {
            int sum = list[0];

            for (int i = 0; i < N - 1; ++i) {
                char c = sb.charAt(i);
                if (c == '+') {
                    sum += list[i + 1];
                } else if (c == '-') {
                    sum -= list[i + 1];
                } else if (c == '*') {
                    sum *= list[i + 1];
                } else {
                    sum /= list[i + 1];
                }
            }

            max = Math.max(max, sum);
            min = Math.min(min, sum);
            return;
        }

        for (int i = 0; i < 4; ++i) {
            if (operation[i] > 0) {
                operation[i]--;
                if (i == 0) {
                    sb.append("+");
                } else if (i == 1) {
                    sb.append("-");
                } else if (i == 2) {
                    sb.append("*");
                } else if (i == 3) {
                    sb.append("/");
                }
                backTracking(depth + 1);
                sb.deleteCharAt(sb.length() - 1);
                operation[i]++;
            }
        }
    }
}
