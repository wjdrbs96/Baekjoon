package Baekjoon.Java.BOJ5500;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main_5597 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < 28; ++i) {
            list.add(input.nextInt());
        }

        for (int i = 1; i <= 30; ++i) {
            if (!list.contains(i)) {
                list1.add(i);
            }
        }

        Collections.sort(list1);

        for (int i = 0; i < list1.size(); ++i) {
            System.out.println(list1.get(i));
        }




    }
}
