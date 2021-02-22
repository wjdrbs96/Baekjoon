package Baekjoon.Java.BOJ10800;

import java.util.Scanner;

public class Main_10816 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        // 입력 값에 음수가 입기 때문에 배열의 크기를 2배로 늘려서 함
        int[] card = new int[20000001];
        for (int i = 0; i < N; ++i) {
            ++card[sc.nextInt() + 10000000];
        }
        int M = sc.nextInt();

        for (int i = 0; i < M; ++i) {
            sb.append(card[sc.nextInt() + 10000000] + " ");
        }
        System.out.println(sb.toString());
    }

}