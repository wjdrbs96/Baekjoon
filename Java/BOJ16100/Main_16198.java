package Baekjoon.Java.BOJ16100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * created by jg 2021/04/15
 */
public class Main_16198 {
    private static int N;
    private static List<Integer> list;
    private static int sum = 0;
    private static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        list = new LinkedList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; ++i) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        combination();
        System.out.println(max);
    }

    private static void combination() {
        if (list.size() == 2) {
            max = Math.max(max, sum);
            return;
        }

        for (int i = 1; i < list.size() - 1; ++i) {
            int t = (list.get(i - 1) * list.get(i + 1));
            sum += t;
            int a = list.remove(i);
            combination();
            list.add(i, a);
            sum -= t;
        }
    }
}

