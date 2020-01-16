package Java_Algorithm;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = new int[3];
        for (int i = 0; i < 3; i++) {
            list[i] = input.nextInt();
        }

        int a = list[1] - list[0];
        int b = list[2] - list[1];

        if (a < b) {
            System.out.println(b-1);
        }
        else {
            System.out.println(a-1);
        }
    }
}
