package Baekjoon.Java.BOJ4600;

public class Main_4673 {
    public static void main(String[] args) {
        int[] list = new int[10001];

        for (int i = 1; i <= list.length; ++i) {
            int result = calculate(i);
            if (result <= 10000) {
                list[result] = 1;
            }
        }

        for (int i = 1; i < list.length; ++i) {
            if (list[i] != 1) {
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
