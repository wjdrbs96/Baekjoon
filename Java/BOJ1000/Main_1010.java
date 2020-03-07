package Baekjoon.Java.BOJ1000;

/*
import java.util.Scanner;

public class Main_1010 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 0; i < n; ++i) {
            int a = input.nextInt();
            int b = input.nextInt();

            if (a == b) {
                System.out.println(1);
                continue;
            }
            long result = 1;
            long sum = 1;
            int savea = a;
            int saveb = b;

            if (b / 2 > a) {
                for (int j = 0; j < a; ++j) {
                    result *= saveb--;
                }

                for (int j = 0; j < a; ++j) {
                    sum *= savea--;
                }

                System.out.println(result / sum);
            }

            else {
                int save = b - a;
                for (int j = 0; j < saveb - savea; ++j) {
                    result *= b--;
                }

                for (int j = 0; j < saveb - savea; ++j) {
                    sum *= save--;
                }


                System.out.println(result / sum);
            }
        }
    }
}
*/


import java.math.BigInteger;
import java.util.Scanner;

public class Main_1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int r = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(combination(r,n));
        }
    }

    public static BigInteger combination(int r, int n) {
        BigInteger sum = new BigInteger("1");
        int temp = r;

        while(r > 0) {
            sum = sum.multiply(BigInteger.valueOf(n));
            --r;
            --n;
        }

        while(temp > 0) {
            sum = sum.divide(BigInteger.valueOf(temp));
            --temp;
        }
        return sum;
    }
}