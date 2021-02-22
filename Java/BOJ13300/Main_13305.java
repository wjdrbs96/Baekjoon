package Baekjoon.Java.BOJ13300;

import java.util.Scanner;

public class Main_13305 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        // 도시 사이의 거리
        long[] cityLength = new long[N - 1];

        for (int i = 0; i < N - 1; ++i) {
            cityLength[i] = input.nextLong();
        }

        // 도시당 기름 가격
        long[] cityMoney = new long[N];

        for (int j = 0; j < N; ++j) {
            cityMoney[j] = input.nextLong();
        }

        long totalMoney = 0;
        long tmp = cityMoney[0];

        for (int i = 0; i < cityMoney.length - 1; ++i) {
            if (tmp > cityMoney[i]) {
                tmp = cityMoney[i];
            }
            totalMoney += (tmp * cityLength[i]);
        }

        System.out.println(totalMoney);
    }
}
