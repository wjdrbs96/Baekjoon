package Baekjoon.Java.BOJ5500;

import java.util.Scanner;

public class Main_5532 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int L = input.nextInt();
        int A = input.nextInt();
        int B = input.nextInt();

        int C = input.nextInt();
        int D = input.nextInt();

        int p = B / D;
        int q = A / C;

        if (p < q) {
            if (A % C == 0) {
                System.out.println(L - q);
            } else {
                System.out.println(L - q - 1);
            }
        } else if (p > q){
            if (B % D == 0) {
                System.out.println(L - p);
            } else {
                System.out.println(L - p - 1);
            }
        } else {
            if (B % D != 0 && A % C != 0) {
                System.out.println(L - p - 1);
            } else if (B % D == 0 && A % C == 0){
                System.out.println(L - p);
            } else {
                System.out.println(L - p - 1);
            }
        }
    }
}
