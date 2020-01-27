package Java_Algorithm;

import java.util.Scanner;

public class Main_2247 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] list = new int[n + 1];

        list[0] = 0;
        list[1] = 1;

        for (int i = 2; i <= n; ++i) {
            list[i] = list[i-2] + list[i-1];
        }

        System.out.println(list[n]);

    }
}
