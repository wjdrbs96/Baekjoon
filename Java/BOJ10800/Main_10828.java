package Baekjoon.Java.BOJ10800;

import java.util.Scanner;
import java.util.Stack;

public class Main_10828 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int n = input.nextInt();
        String[] list = new String[n];

        for (int i = 0; i < n; ++i) {
            list[i] = input.next();

            if (list[i].contains("push")) {
                int a = input.nextInt();
                stack.push(a);
            } else if (list[i].equals("pop")) {
                if (stack.size() == 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.pop());
                }
            } else if (list[i].equals("top")) {
                if (stack.size() == 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.peek());
                }
            } else if (list[i].equals("empty")) {
                if (stack.size() == 0) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if (list[i].equals("size")) {
                System.out.println(stack.size());
            }
        }
    }
}
