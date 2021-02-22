//백준 1158번 문제
package Baekjoon.Java.BOJ1100;

import java.util.LinkedList;
import java.util.Scanner;

public class Main_1158 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        for (int i = 0; i < a; i++) {
            list.add(i + 1);
        }
        int c = b - 1;
        while (list.size() > 1) {
            System.out.print(list.remove(c));
            c = c + 2;
            c = c % list.size();
        }
        System.out.println(list.remove() + ">");
    }
}
