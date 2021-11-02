package Baekjoon.Java.BOJ1300;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main_1302 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, Integer> hm = new HashMap<>();


        int n = input.nextInt();

        for (int i = 0; i < n; ++i) {
            String book = input.next();

            if (!hm.containsKey(book)) {
                hm.put(book, 1);
            } else {
                hm.put(book, hm.get(book) + 1);
            }
        }

        int max = 0;
        for (String a : hm.keySet()) {
            max = Math.max(max, hm.get(a));
        }

        List<String> list = new ArrayList<>(hm.keySet());
        Collections.sort(list);

        for (String a : list) {
            if (hm.get(a) == max) {
                System.out.println(a);
                break;
            }
        }

    }

}
