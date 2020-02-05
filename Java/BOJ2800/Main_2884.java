package Baekjoon.Java.BOJ2800;

import java.util.Scanner;

public class Main_2884 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int H = input.nextInt();
        int M = input.nextInt();

        if (M < 45) {
            if (H == 1) {
                System.out.print(H - 1 + " ");
                System.out.println(60 + M - 45);
            }
            else if (H == 0) {
                System.out.print(23 + " ");
                System.out.println(60 + M - 45);

            }
            else {
                System.out.print(H - 1 + " ");
                System.out.println(60 + M - 45);
            }
        } else {
            System.out.print(H + " ");
            System.out.println(M - 45);
        }
    }
}
