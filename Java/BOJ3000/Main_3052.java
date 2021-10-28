package Baekjoon.Java.BOJ3000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] list = new int[10];

        Set<Integer> hs = new HashSet<>();

        for (int i = 0; i < 10; ++i) {
            list[i] = Integer.parseInt(br.readLine());
            hs.add(list[i] % 42);
        }

        System.out.println(hs.size());
    }
}
