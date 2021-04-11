package Baekjoon.Java.BOJ11400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * created by jg 2021/04/11
 */
public class Main_11497 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; ++i) {
            int N = Integer.parseInt(br.readLine());
            int[] list = new int[N];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; ++j) {
                list[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(list);
            int a = 0;
            int b = N - 1;
            int min = Integer.MAX_VALUE;

            int[] answer = new int[N];
            for (int k = 0; k < N; ++k) {
                if (k % 2 != 0) {
                    answer[a] = list[k];
                    a++;
                } else {
                    answer[b] = list[k];
                    b--;
                }
            }
            min = Math.abs(answer[0] - answer[N - 1]);
            for (int k = 1; k < N; k++) {
                min = Math.max(min, Math.abs(answer[k] - answer[k - 1]));
            }

            System.out.println(min);
        }
    }
}
