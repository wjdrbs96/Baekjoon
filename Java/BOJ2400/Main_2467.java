package Baekjoon.Java.BOJ2400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * created by jg 2021/04/04
 */
public class Main_2467 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        int N = Integer.parseInt(a);

        int[] list = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < list.length; ++i) {
            list[i] = Integer.parseInt(st.nextToken());
        }

        int left = 0;
        int right = N - 1;
        int val = Integer.MAX_VALUE;
        Point point = null;

        while (left < right) {
            int num1 = list[left];
            int num2 = list[right];
            int sum = num1 + num2;

            if (Math.abs(sum) < val) {
                val = Math.abs(sum);
                point = new Point(num1, num2);
            }

            if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println(point.x + " " + point.y);
    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
