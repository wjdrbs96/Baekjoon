package Baekjoon.Java.BOJ2400;

/*
import java.util.Scanner;

public class Main_2407 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();
        int m1 = m;

        long sum1 = 1;
        long sum2 = 1;
        if (n / 2 < m) {
            int save = n - m;
            int m2 = save;

            for (int i = 1; i <= save; ++i) {
                sum1 *= n--;
            }

            for (int i = 1; i <= save; ++i) {
                sum2 *= m2--;
            }
        }

        else {

            for (int i = 1; i <= m; ++i) {
                sum1 *= n--;
            }


            for (int i = 1; i <= m; ++i) {
                sum2 *= m1--;
            }
        }


        System.out.println(sum1 / sum2);

    }
}
*/

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main_2407 {

    static BigInteger[][] list;

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        BigInteger big = new BigInteger("1");

        int n = sc.nextInt();
        int m = sc.nextInt();
        list = new BigInteger[1001][1001];
        list[1][0] = list[1][1] = big;

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j || j == 0)
                    list[i][j] = big;
                else
                    list[i][j] = list[i - 1][j - 1].add(list[i - 1][j]);
            }
        }

        System.out.println(list[n][m]);
    }
}

