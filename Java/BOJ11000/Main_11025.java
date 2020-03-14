package Baekjoon.Java.BOJ11000;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_11025 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int K = input.nextInt() - 1;
        int idx = K;

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; ++i) {
            list.add(i);
        }


        while (list.size() != 1) {
            list.remove(idx);
            idx = (idx + K) % list.size();
        }




    }
}
