package Baekjoon.Java.BOJ11000;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// 답은 잘 나오지만 메모리 초과나는 코드
public class Main_11025 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int K = input.nextInt() - 1;
        int idx = K;

        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < N; ++i) {
            list.add(i);
        }


        while (list.size() != 1) {
            list.remove(idx);
            idx = (idx + K) % list.size();
        }

        System.out.println(list.get(0) + 1);
    }
}
