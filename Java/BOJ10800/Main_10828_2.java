package Baekjoon.Java.BOJ10800;

import java.util.Scanner;

public class Main_10828_2 {
    int top;
    int[] stack;
    int size;

    public Main_10828_2(int size) {
        top = -1;
        stack = new int[size];
        this.size = size;
    }

    public int peek() {
        return stack[top];
    }

    public void push(int value) {
        stack[++top] = value;
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        else {
            return false;
        }
    }

    public int pop() {
        return stack[top--];
    }
    public int Size() {
        return top;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Main_10828_2 stack = new Main_10828_2(10000);
        int n = input.nextInt();

        for (int i = 0; i < n; ++i) {
            String s = input.next();

            if (s.contains("push")) {
                int a = input.nextInt();
                stack.push(a);

            }

            else if (s.equals("pop")) {
                if (stack.Size()== -1) {
                    System.out.println(-1);
                }
                else {
                    System.out.println(stack.pop());
                }
            }

            else if (s.equals("top")) {
                if (stack.Size() == -1) {
                    System.out.println(-1);
                }
                else {
                    System.out.println(stack.peek());
                }
            }

            else if (s.equals("empty")) {
                if (stack.isEmpty()) {
                    System.out.println(1);
                }
                else {
                    System.out.println(0);
                }
            }

            else if (s.equals("size")) {
                System.out.println(stack.Size() + 1);
            }
        }

    }
}
