package Baekjoon.Java.BOJ1400;

import java.util.Scanner;
import java.util.Stack;

public class Main_1406 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for (int j = 0; j < name.length(); ++j) {
            stack1.push(name.charAt(j));
        }
        int n = input.nextInt();

        for (int i = 0; i < n; ++i) {
            String a = input.next();
            if (a.equals("P")) {
                String b = input.next();
                stack1.push(b.charAt(0));

            }
            else {
                if (a.equals("L")) {
                    if (stack1.isEmpty()) {
                        continue;
                    }
                    char c = stack1.pop();
                    stack2.push(c);
                }
                else if (a.equals("D")) {
                    if (stack2.isEmpty()) {
                        continue;
                    }
                    char c = stack2.pop();
                    stack1.push(c);
                }
                else if (a.equals("B")) {
                    if (stack1.isEmpty()) {
                        continue;
                    }
                    stack1.pop();
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        while (!stack1.isEmpty()) {
            sb.append(stack1.pop());
        }
        sb.reverse();

        while (!stack2.isEmpty()) {
            sb.append(stack2.pop());
        }

        System.out.println(sb.toString());

    }
}
