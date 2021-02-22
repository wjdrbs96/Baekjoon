package Baekjoon.Java.BOJ2100;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main_2164 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Deque<Integer> queue = new ArrayDeque<>();

        int n = input.nextInt();

        for (int i = 0; i < n; ++i) {
            queue.addLast(i + 1);
        }

        while (queue.size() > 1) {
            queue.pollFirst();

            if (queue.size() == 1) break;

            queue.offerLast(queue.pollFirst());
        }

        System.out.println(queue.pollFirst());


    }
}
