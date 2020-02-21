package Baekjoon.Java.BOJ10700;

import java.util.Scanner;
import java.util.Stack;

public class Main_10799 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        String st = input.nextLine();

        int sum = 0;
        for (int i = 0; i < st.length(); ++i) {
            if (st.charAt(i) == '(') {
                stack.add(st.charAt(i));
            }
            else {
                stack.pop();
                if (st.charAt(i - 1) == '(') {
                    sum += stack.size();
                }
                else {
                    sum++;
                }
            }
        }

        System.out.println(sum);

    }
}
