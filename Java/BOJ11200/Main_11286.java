package Baekjoon.Java.BOJ11200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

/**
 * created by Gyunny 2021/11/02
 */
public class Main_11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pr = new PriorityQueue<>();

        // 우선순위 큐에 (절대 값, 원본 값) Class 형태로 저장하기
        for (int i = 0; i < N; ++i) {
            int a = Integer.parseInt(br.readLine());
            if (a != 0) {
                pr.add(a);
            } else {
                if (pr.poll() == null) {
                    System.out.println(0);
                } else {
                    System.out.println(pr.poll());
                }
            }
        }
    }
}
