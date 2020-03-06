package Baekjoon.Java.BOJ2300;

import java.util.Scanner;

public class Main_2312 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 0; i < n; ++i) {
            int[] list = new int[100001];
            int test = input.nextInt();

            for (int j = 2; j * j <= test; ++j) {
                if (test % j == 0) {
                    test = test / j;
                    list[j]++;
                    j--;
                }
            }

            if (test > 1) {
                list[test]++;
            }

            for (int j = 1; j <= 100000; ++j) {
                if (list[j] != 0) {
                    System.out.println(j +" " + list[j]);
                }
            }


        }
    }


}
