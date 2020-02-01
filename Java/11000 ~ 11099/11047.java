package BOJ;

import java.util.Scanner;

public class Main_11047 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int total = input.nextInt();
        int[] list = new int[N];
        int count = 0;

        for (int i = 0; i < N; ++i) {
            list[i] = input.nextInt();
        }

        for (int i = N - 1; i >= 0; --i) {
            if (list[i] > total) {
                continue;
            } else {
                count += total / list[i];
                total = total % list[i];

            }

        }
        System.out.println(count);


    }
}
