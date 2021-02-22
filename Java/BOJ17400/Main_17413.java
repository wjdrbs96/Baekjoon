package Baekjoon.Java.BOJ17400;

import java.util.Scanner;
import java.util.Stack;

public class Main_17413 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean visit = false;
        Stack<Character> stack = new Stack<>();

        String name = input.nextLine();


        for (int i = 0; i < name.length(); ++i) {
            if (name.charAt(i) == ' ') {
                while (!stack.isEmpty()) {
                    System.out.print(stack.pop());
                }
                System.out.print(" ");
            } else if (name.charAt(i) == '<') {
                visit = true;
                while (!stack.isEmpty()) {
                    System.out.print(stack.pop());
                }

                System.out.print('<');
            } else if (name.charAt(i) == '>') {
                StringBuilder sb = new StringBuilder();
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.reverse();
                System.out.print(sb.toString());
                System.out.print('>');
                visit = false;
            } else {
                if (visit == false) {
                    stack.push(name.charAt(i));
                } else {
                    System.out.print(name.charAt(i));
                }

            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
