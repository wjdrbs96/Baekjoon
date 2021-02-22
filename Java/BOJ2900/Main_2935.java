package Baekjoon.Java.BOJ2900;

import java.math.BigInteger;
import java.util.Scanner;

public class Main_2935 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BigInteger A = new BigInteger(input.next());
        String ch = input.next();
        BigInteger B = new BigInteger(input.next());

        if (ch.equals("+")) {
            System.out.println(A.add(B));
        } else if (ch.equals("*")) {
            System.out.println(A.multiply(B));
        }
    }
}
