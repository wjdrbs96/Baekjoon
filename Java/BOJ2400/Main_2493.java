package Baekjoon.Java.BOJ2400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

// 메모리 초과 => 풀이 참고 (ps: 알고리즘 잘하고 싶다)
public class Main_2493 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        Stack<Top> stack = new Stack<>();
        st = new StringTokenizer(br.readLine());

        for (int i = 1; i < N + 1; ++i) {
            int v = Integer.parseInt(st.nextToken());

            while (!stack.isEmpty()) {
                if (stack.peek().height >= v) {
                    System.out.print(stack.peek().idx + " ");
                    break;
                }
                stack.pop();
            }

            if (stack.isEmpty()) {
                System.out.print("0 ");
            }

            stack.push(new Top(i, v));
        }
    }
}

class Top {
    int idx;
    int height;

    public Top(int idx, int height) {
        this.idx = idx;
        this.height = height;
    }
}