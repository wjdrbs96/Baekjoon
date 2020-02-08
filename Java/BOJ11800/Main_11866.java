package Baekjoon.Java.BOJ11800;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main_11866 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = input.nextInt();
        int K = input.nextInt() - 1;
        int idx = K;

        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < N; ++i) {
            list.add(i + 1);
        }
        sb.append("<");

        while (list.size() != 1) {
            sb.append(list.get(idx).toString() + ", ");
            list.remove(idx);
            idx = (idx + K) % list.size();
        }
        sb.append(list.get(0).toString() + ">");
        System.out.println(sb);


    }
}
