package Baekjoon.Java.BOJ2900;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main_2945 {
    public static void main(String[] args) {
        Map<Integer, Integer> hm = new HashMap<>();
        Scanner input = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 5; ++i) {
            sum = 0;
            for (int j = 0; j < 4; ++j) {
                sum += input.nextInt();
            }
            hm.put(i + 1, sum);
        }

        int a = Collections.max(hm.values());

        for (int key : hm.keySet()) {
            if (hm.get(key) == a) {
                System.out.print(key + " ");
                break;
            }
        }

        System.out.println(a);



    }
}
