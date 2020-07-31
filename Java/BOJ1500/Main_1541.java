package Baekjoon.Java.BOJ1500;

import java.util.Scanner;

public class Main_1541 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer = input.next();

        String[] list = answer.split("-");
        int result = 0;

        for (int i = 0; i < list.length; ++i) {
            String[] l = list[i].split("\\+");
            int sum = 0;
            for (int j = 0; j < l.length; ++j) {
                sum += Integer.parseInt(l[j]);
            }

            if (i == 0) sum *= -1;
            result -= sum;
        }

        System.out.println(result);
    }
}
