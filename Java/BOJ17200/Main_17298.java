package Baekjoon.Java.BOJ17200;

import java.util.Scanner;
import java.util.Stack;

public class Main_17298 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int N = input.nextInt();

        stack.push(input.nextInt());
        for (int i = 0; i < N - 1; ++i) {
            int a = input.nextInt();
            if (stack.peek() < a) {
                System.out.print(a + " ");
            }
            else {
                stack.push(a);
            }


            
        }




    }
}
