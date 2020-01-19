package Java_Algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_2161 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int n = input.nextInt();
        int i = 1;

        for (int j = 1; j <= n; ++j) {
            list.add(j);
        }

        while(true) {
            if (i % 2 == 1) {
                System.out.print(list.get(0) + " ");
                list.remove(0);
            }

            else {
                list.add(list.get(0));
                list.remove(0);
            }

            if (list.size() == 0) break;
            i++;
        }
    }
}
