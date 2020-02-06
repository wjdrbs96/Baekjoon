package Baekjoon.Java.BOJ4600;

public class Main_4673 {
    public static void main(String[] args) {
        int ary[] = new int[10001];

        for (int i = 1; i <= ary.length; ++i) {
            int result = calculate(i);
            if (result <= 10000) {
                ary[result] = 1;
            }
        }

        for (int i = 1; i < ary.length; ++i) {
            if (ary[i] != 1) {
                System.out.println(i);
            }
        }
    }

    public static int calculate(int value) {
        int result = value;

        while (value > 0) {
            result += value % 10;
            value /= 10;
        }

        return result;
    }
}
