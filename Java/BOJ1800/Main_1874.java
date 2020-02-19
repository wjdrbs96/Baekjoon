package Baekjoon.Java.BOJ1800;

import java.util.Scanner;
import java.util.Stack;

public class Main_1874 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int n = input.nextInt();

        for (int i = 1; i <= n; ++i) {
            int a = input.nextInt();
            for (int j = i; j <= a; ++j) {
                System.out.println("+");
            }
            stack.push(a);



        }



    }
}
