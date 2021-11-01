package Baekjoon.Java.BOJ1500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * created by Gyunny 2021/10/28
 */
public class Main_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        double[] list = new double[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; ++i) {
            list[i] = Double.parseDouble(st.nextToken());
        }

        Arrays.sort(list);

        double max = list[list.length - 1];

        double sum = 0;
        for (int i = 0; i < N; ++i) {
            sum += (list[i] / max * 100);
        }

        System.out.println(sum / N);

    }
}
