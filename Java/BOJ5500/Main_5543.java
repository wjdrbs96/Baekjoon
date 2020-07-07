package Baekjoon.Java.BOJ5500;

import java.util.Arrays;
import java.util.Scanner;

public class Main_5543 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = new int[4];
        int[] list2 = new int[3];

        for (int i = 1; i <= 3; ++i) {
            list[i] = input.nextInt();
        }

        for (int i = 1; i < 3; ++i) {
            list2[i] = input.nextInt();
        }

        Arrays.sort(list);
        Arrays.sort(list2);

        System.out.println(list[1] + list2[1] - 50);


    }
}
