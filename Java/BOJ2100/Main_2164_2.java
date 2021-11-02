package Baekjoon.Java.BOJ2100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * created by Gyunny 2021/11/02
 */
public class Main_2164_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; ++i) {
            queue.add(i);
        }

        while (queue.size() > 1) {
            queue.poll(); // 첫 번째 맨 위 카드 버림
            queue.offer(queue.poll());
        }

        System.out.println(queue.poll());
    }
}
