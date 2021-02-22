package Baekjoon.Java.BOJ2200;

import java.util.Scanner;

public class Main_2231 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        int i = 1;
        int value = 0;
        boolean check = false;
        while (i < N) {
            value = divideValue(i);
            if (value == N) {
                check = true;
                break;
            }
            i++;
        }
        if (check) {
            System.out.println(i);
        } else {
            System.out.println(0);
        }
    }

    static int divideValue(int i) {
        String a = String.valueOf(i);

        int sum = 0;
        String[] list = a.split("");
        for (int k = 0; k < list.length; ++k) {
            sum += Integer.parseInt(list[k]);
        }
        sum += i;
        return sum;
    }
}
