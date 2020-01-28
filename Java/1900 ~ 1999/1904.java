package Java_Algorithm;

import java.util.Scanner;

public class Main_1904 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] list = new int[n + 1];

        list[1] = 1; list[2] = 2;
        for (int i = 3; i <= n; ++i) {
            list[i] = (list[i-1] + list[i-2]) % 15746;
        }

        System.out.println(list[n]);


    }
}
