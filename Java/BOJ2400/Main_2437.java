package Baekjoon.Java.BOJ2400;

import java.util.Arrays;
import java.util.Scanner;

public class Main_2437 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();   // 저울 추 개수
        int[] list = new int[N + 1];

        for (int i = 1; i < N + 1; ++i) {
            list[i] = input.nextInt();
        }

        Arrays.sort(list);

        // 누적합 개념 참고 했음 (신기)
        int sum = 0;
        for (int i = 1; i < list.length; ++i) {
            if (sum + 1 < list[i]) {
                break;
            }
            sum += list[i];
        }
        System.out.println(sum + 1);
    }
}
