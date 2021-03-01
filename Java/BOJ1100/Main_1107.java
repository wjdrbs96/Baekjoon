package Baekjoon.Java.BOJ1100;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_1107 {
    static List<Integer> list = new ArrayList<>();

    private static int chk(int num) {
        int length = 0;
        if (num == 0) return list.contains(num) ? 0 : 1;

        while (num > 0) {
            if (list.contains(num % 10)) return 0;

            length++;
            num /= 10;
        }

        return length;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int chanel = scan.nextInt(), m = scan.nextInt();

        while (m-- > 0) list.add(scan.nextInt());

        int min = Math.abs(chanel - 100);

        for (int i = 0; i <= 1000000; i++) {
            int length = chk(i);

            if (length > 0) min = Math.min(min, Math.abs(chanel - i) + length);
        }

        System.out.print(min);
    }
}