package Baekjoon.Java.BOJ9000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; ++i) {
            String name = br.readLine();
            name += "\n";

            for (int j = 0; j < name.length(); ++j) {
                if (name.charAt(j) == ' ' || name.charAt(j) == '\n') {
                    while (!stack.isEmpty()) {
                        System.out.print(stack.pop());
                    }
                    System.out.print(" ");
                }
                else {
                    stack.push(name.charAt(j));
                }
            }
            System.out.println();
        }


        br.close();


    }
}