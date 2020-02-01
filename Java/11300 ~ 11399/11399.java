package BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class Main_11399 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] list = new int[n];

        for (int i = 0; i < n; ++i) {
            list[i] = input.nextInt();
        }

        Arrays.sort(list);

        int sum = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j <= i; ++j) {
                sum += list[j];
            }

        }
        System.out.println(sum);
    }
}
