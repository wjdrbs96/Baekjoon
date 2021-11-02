package Baekjoon.Java.BOJ1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * created by Gyunny 2021/11/01
 */
public class Main_1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int yHeight = h - y;
        int xHorizontal = w - x;

        List<Integer> list = Arrays.asList(x, y, xHorizontal, yHeight);
        Collections.sort(list);
        System.out.println(list.get(0));
    }
}
