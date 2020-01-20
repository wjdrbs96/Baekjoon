package Java_Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Main_2750 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] list = new int[n];

        for (int i = 0; i < n; ++i) {
            list[i] = input.nextInt();
        }

        Arrays.sort(list);

        for (int k : list) {
            System.out.println(k);
        }
    }
}
