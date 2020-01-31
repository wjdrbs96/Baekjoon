package Java_Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Main_2309 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = new int[9];
        int sum = 0;
        boolean check = false;

        for(int i = 0; i < 9; ++i) {
            list[i] = input.nextInt();
            sum += list[i];
        }


        for (int i = 0 ; i < 9; ++i) {
            if (check) break;
            for (int j = 0; j < 9; ++j) {
                if (i == j) continue;
                if (sum - list[i] - list[j] == 100) {
                    list[i] = 0;
                    list[j] = 0;
                    check = true;
                    break;

                }
            }
        }

        Arrays.sort(list);

        for (int i = 2; i < 9; ++i) {
            System.out.println(list[i]);
        }


    }
}
