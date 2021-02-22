package Baekjoon.Java.BOJ17200;

import java.io.*;
import java.util.Stack;

public class Main_17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] list = new int[n];

        int[] answer = new int[n];
        String[] temp = br.readLine().split(" ");

        for (int i = 0; i < n; ++i) {
            list[i] = Integer.parseInt(temp[i]);
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (int i = 1; i < n; ++i) {
            if (stack.isEmpty()) {
                stack.push(i);
            }

            while (!stack.isEmpty() && list[stack.peek()] < list[i]) {
                answer[stack.pop()] = list[i];
            }

            stack.push(i);

        }

        while (!stack.empty()) {
            answer[stack.pop()] = -1;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < n; ++i) {
            bw.write(answer[i] + " ");
        }

        bw.write("\n");
        bw.flush();


    }
}
