package Baekjoon.Java.BOJ1900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * created by Gyunny 2021/11/02
 */
public class Main_1935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String s = br.readLine();
        Map<Character, Double> hm = new HashMap<>();

        for (int i = 0; i < N; ++i) {
            hm.put((char) ((int)'A' + (i)), Double.parseDouble(br.readLine()));
        }

        Stack<Double> stack = new Stack<>();
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (ch == '*') {
                double a = stack.pop();
                double b = stack.pop();
                stack.push(b * a);
            } else if (ch == '+') {
                double a = stack.pop();
                double b = stack.pop();
                stack.push(b + a);
            } else if (ch == '/') {
                double a = stack.pop();
                double b = stack.pop();
                stack.push(b / a);
            } else if (ch == '-') {
                double a = stack.pop();
                double b = stack.pop();
                stack.push(b - a);
            } else {
                // 숫자면
                stack.push(Double.parseDouble(String.valueOf(hm.get(ch))));
            }
        }

        System.out.printf("%.2f", stack.pop());
    }
}
