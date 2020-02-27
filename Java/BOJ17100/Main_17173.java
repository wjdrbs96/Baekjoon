package Baekjoon.Java.BOJ17100;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_17173 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int N = input.nextInt();
        int M = input.nextInt();

        int[] k = new int[M];

        for (int i = 0; i < M; ++i) {
            k[i] = input.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < M; ++i) {
            for (int j = 2; j <= N; ++j) {
                if (j % k[i] == 0 && !list.contains(j)) {
                    list.add(j);
                }
            }
        }

        for (int i = 0; i < list.size(); ++i) {
            sum += list.get(i);
        }

        System.out.println(sum);
    }
}
