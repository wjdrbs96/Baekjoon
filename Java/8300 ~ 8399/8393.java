package Java_Algorithm;

import java.util.Scanner;

public class Main_8393 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; ++i) {
            sum += i;
        }

        System.out.println(sum);
    }
}
