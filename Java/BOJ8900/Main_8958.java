package Baekjoon.Java.BOJ8900;

import java.util.Scanner;

public class Main_8958 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] list = new String[n];

        for (int i = 0; i < n; ++i) {
            list[i] = input.next();
        }
        int count = 0;
        int sum = 0;

        for (int j = 0; j < list.length; ++j) {
            for (int k = 0; k < list[j].length(); ++k) {
                if (list[j].charAt(k) == 'O') {
                    count++;
                    sum+=count;
                }
                else {
                    count = 0;
                }
            }
            System.out.println(sum);
            sum = 0;
            count = 0;
        }
    }
}
