package Baekjoon.Java.BOJ1400;

import java.util.Scanner;

public class Main_1439 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.next();
        int zeroGroup = 0;
        int checkZeroCount = 0;
        int oneGroup = 0;
        int checkOneCount = 0;

        for (char ch : str.toCharArray()) {
            if (ch == '0') {
                checkZeroCount++;
                if (checkZeroCount == 1) {
                    zeroGroup++;
                }
                checkOneCount = 0;
            } else if (ch == '1') {
                checkOneCount++;
                if (checkOneCount == 1) {
                    oneGroup++;
                }
                checkZeroCount = 0;
            }
        }

        if (oneGroup >= zeroGroup) {
            System.out.println(zeroGroup);
        }
        else {
            System.out.println(oneGroup);
        }
    }
}
