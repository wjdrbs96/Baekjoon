package Baekjoon.Java.BOJ15600;

/**
 * created by jg 2021/04/18
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main_15658 {
    private static int N;
    private static int[] list;
    private static int[] operation;
    private static int max = Integer.MIN_VALUE;
    private static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

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

        backTracking(0, list[0]);
        System.out.println(max);
        System.out.println(min);
    }

    private static void backTracking(int depth, int sum) {
        if (depth == N - 1) {
            max = Math.max(max, sum);
            min = Math.min(min, sum);
            return;
        }

        for (int i = 0; i < 4; ++i) {
            if (operation[i] > 0) {
                operation[i]--;
                if (i == 0) {
                    sum += list[depth + 1];
                    backTracking(depth + 1, sum);
                    sum -= list[depth + 1];
                } else if (i == 1) {
                    sum -= list[depth + 1];
                    backTracking(depth + 1, sum);
                    sum += list[depth + 1];
                } else if (i == 2) {
                    sum *= list[depth + 1];
                    backTracking(depth + 1, sum);
                    sum /= list[depth + 1];
                } else if (i == 3) {
                    sum /= list[depth + 1];
                    backTracking(depth + 1, sum);
                    sum *= list[depth + 1];
                }
                operation[i]++;
            }
        }
    }
}

