package Baekjoon.Java.BOJ14400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * created by Gyunny 2021/12/13
 */
public class Main_14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<String> listN = new ArrayList<>();
        for (int i = 0; i < N; ++i) {
            listN.add(br.readLine());
        }

        int count = 0;
        for (int i = 0; i < M; ++i) {
            String name = br.readLine();
            if (listN.contains(name)) {
                count++;
            }
        }

        System.out.println(count);

    }
}
