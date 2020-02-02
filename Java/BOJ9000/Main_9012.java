package Baekjoon.Java.BOJ9000;

import java.util.Scanner;
import java.util.Stack;

// 어떻게 풀어야 할지는 되게 쉬웠는데 YES NO 를 출력하는 부분의 boolean 을 사용하는 팁을 얻은 구글링 한 문제

public class Main_9012 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        input.nextLine();
        for (int i = 0; i < n; ++i) {
            Stack<Character> stack = new Stack();
            boolean b = true;
            String s = input.nextLine();

            for (int j = 0; j < s.length(); ++j) {
                if (s.charAt(j) == '(') {
                    stack.push(s.charAt(j));
                }

                else if (s.charAt(j) == ')') {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }

                    else {
                        b = false;
                        break;
                    }
                }
            }

            if(!stack.isEmpty()) {
                b = false;
            }

            if(b) {
                System.out.println("YES");
            }

            else {
                System.out.println("NO");
            }

        }
    }
}
