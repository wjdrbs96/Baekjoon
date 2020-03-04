package Baekjoon.Java.BOJ2500;

import java.util.*;

public class Main_2587 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int sum = 0;
        for (int i = 0; i < 5; ++i) {
            int a = input.nextInt();
            sum += a;
            list.add(a);
        }

        Collections.sort(list);

        System.out.println(sum / 5);
        System.out.println(list.get(2));


    }
}
