package Baekjoon.Java.BOJ1700;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main_1715 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Long> pq = new PriorityQueue<>();
        long sum = 0;

        for (int i = 0; i < N; i++) {
            pq.add(Long.parseLong(br.readLine()));
        }

        // 카드가 1개라면 0번 비교
        if (pq.size() == 1) {
            System.out.println(0);
            return;
        }

        while (!pq.isEmpty()) {
            long a = pq.poll();
            long b = pq.poll();

            sum += a;
            sum += b;

            if (!pq.isEmpty()) {
                pq.add(a+b);
            }
        }

        System.out.println(sum);
    }
}
