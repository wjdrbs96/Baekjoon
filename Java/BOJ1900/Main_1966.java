package Baekjoon.Java.BOJ1900;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main_1966 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();  // test case 수
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder()); // 최대 힙

        for (int i = 0; i < t; ++i) {
            int count = 0;
            int N = input.nextInt();  // 문서의 수
            int M = input.nextInt();  // 궁금한 문서가 Queue에서 위치한 곳
            int[] list = new int[N];  // 큐 중요도 저장

            for (int j = 0; j < N; ++j) {
                int a = input.nextInt();
                priorityQueue.offer(a);
                list[j] = a;
            }

            while (!priorityQueue.isEmpty()) {
                for (int k = 0; k < list.length; ++k) {
                    if (priorityQueue.peek() == list[k]) {
                        priorityQueue.poll();
                        count++;
                        if (k == M) {
                            priorityQueue.clear();
                            break;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}
