package Java_Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class RoomNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        double[] list = new double[10];
        int count = 0;

        for (int i = 0; i < s.length(); ++i) {
            for (int j = 0; j < 10; ++j) {
                if ((48 + j) == (int)(s.charAt(i))) {
                    if (j == 6 || j == 9) {
                        list[6]+=0.5;
                    }
                    else {
                        list[j]+=1;
                    }
                }
            }
        }
        Arrays.sort(list);
        System.out.println(Math.round(list[list.length-1]));
    }
}
