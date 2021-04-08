package Baekjoon.Java.BOJ14600;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * created by jg 2021/04/09
 */
public class Main_14659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] list = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; ++i) {
            list[i] = Integer.parseInt(st.nextToken());
        }

        PriorityQueue<Integer> pr = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < N - 1; ++i) {
            int count = 0;
            for (int j = i + 1; j < N; ++j) {
                if (list[i] > list[j]) {
                    count++;
                } else {
                    break;
                }
            }
            pr.add(count);
        }

        System.out.println(pr.poll());
    }
}
