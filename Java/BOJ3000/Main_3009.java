package Baekjoon.Java.BOJ3000;

import java.util.Arrays;
import java.util.Scanner;

public class Main_3009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] listX = new int[3];
        int[] listY = new int[3];

        for (int i = 0; i < 3; ++i) {
            listX[i] = input.nextInt();
            listY[i] = input.nextInt();
        }

        Arrays.sort(listX);
        Arrays.sort(listY);

        int saveX = 0;
        if (listX[0] != listX[1]) {
            saveX = listX[0];
        } else {
            saveX = listX[2];
        }

        int saveY = 0;
        if (listY[0] != listY[1]) {
            saveY = listY[0];
        } else {
            saveY = listY[2];
        }

        System.out.println(saveX + " " + saveY);


    }
}
