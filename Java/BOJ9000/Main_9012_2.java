package Baekjoon.Java.BOJ9000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * created by Gyunny 2021/11/02
 */
public class Main_9012_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; ++i) {
            boolean check = true;
            String s = br.readLine();
            Stack<Character> stack = new Stack<>();

            for (int j = 0; j < s.length(); ++j) {
                if (s.charAt(j) == '(') {
                    stack.push(s.charAt(j));
                } else if (s.charAt(j) == ')') {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    } else {
                        System.out.println("NO");
                        check = false;
                        break;
                    }
                }
            }

            if (check) {
                if (stack.isEmpty()) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
