package Baekjoon.Java.BOJ17900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * created by jg 2021/04/08
 */
public class Main_17939 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; ++i) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        int sum = 0;
        int first = list.get(list.size() - 1);
        for (int i = list.size() - 2; i >= 0; --i) {
            if (list.get(i) < first) {
                sum += first - list.get(i);
            }
            else {
                first = list.get(i);
            }
        }
        System.out.println(sum);
    }
}
