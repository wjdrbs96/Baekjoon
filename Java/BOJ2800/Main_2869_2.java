package Baekjoon.Java.BOJ2800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * created by Gyunny 2021/11/02
 */
public class Main_2869_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int height = 0;
        int count = 0;

        while (true) {
            height += A;
            count++;
            if (height >= V) break;
            height -= B;
        }

        System.out.println(count);

    }
}
