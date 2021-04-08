package Baekjoon.Java.BOJ14600;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * created by jg 2021/04/09
 */
public class Main_14659_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] list = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; ++i) {
            list[i] = Integer.parseInt(st.nextToken());
        }

        int maxHill = 0;
        int ans = 0;
        int cnt = 0;
        for (int hill : list) {
            if (hill > maxHill) {
                maxHill = hill;
                cnt = 0;
            } else {
                cnt += 1;
            }
            ans = Math.max(ans, cnt);
        }
        System.out.println(ans);
    }
}
