package Baekjoon.Java.BOJ11500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * created by jg 2021/04/06
 */
public class Main_11501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; ++i) {
            int N = Integer.parseInt(br.readLine());

            List<Integer> list = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < N; ++j) {
                list.add(Integer.parseInt(st.nextToken()));
            }

            long sum = 0;

            int max = list.get(N - 1);
            for (int k = N - 2; k >= 0; --k) {
                if (max > list.get(k)) {
                    sum += (max - list.get(k));
                } else {
                    max = list.get(k);
                }
            }
            sb.append(sum + "\n");
        }
        System.out.println(sb.toString());
    }
}
