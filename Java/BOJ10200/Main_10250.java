package Baekjoon.Java.BOJ10200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * created by Gyunny 2021/11/03
 */
public class Main_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());  // 층 수
            int W = Integer.parseInt(st.nextToken());  // 각 층의 방 수
            int N = Integer.parseInt(st.nextToken());  // 몇 번째 손님인지

            int count = 1;
            while (N > H) {
                N = N - H;
                count++;
            }

            System.out.println(N * 100 + count);
        }
    }
}
