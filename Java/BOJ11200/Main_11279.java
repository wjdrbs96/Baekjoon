package Baekjoon.Java.BOJ11200;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main_11279 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); // 연산의 개수
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < n; ++i) {
            int a = input.nextInt();

            if (a == 0) {
                if (!priorityQueue.isEmpty()) {
                    System.out.println(priorityQueue.poll());
                } else {
                    System.out.println(0);
                }
            } else {
                priorityQueue.offer(a);
            }
        }
    }
}
