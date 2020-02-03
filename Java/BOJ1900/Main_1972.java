package Baekjoon.Java.BOJ1900;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main_1972 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int n = input.nextInt();
        int[] list = new int[n];
        int count = 0;

        for (int i = 0; i < n; ++i) {
            int k = input.nextInt();
            list[i] = k;
            count++;
        }

        for (int i = 0; i < count; ++i) {
            if (list[i] == 0) {
                if (pq.size() == 0) {
                    System.out.println(0);
                } else {
                    System.out.println(pq.poll());
                }
            } else if (list[i] > 0) {
                pq.offer(list[i]);
            }
        }



    }
}
