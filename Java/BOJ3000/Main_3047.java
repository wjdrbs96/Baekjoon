package Baekjoon.Java.BOJ3000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main_3047 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < 3; ++i) {
            list.add(input.nextInt());
        }

        String s = input.next();
        Collections.sort(list);

        for (int j = 0; j < 3; ++j) {
            hm.put((char) (65 + j), list.get(j));
        }

        System.out.print(hm.get(s.charAt(0)) + " ");
        System.out.print(hm.get(s.charAt(1)) + " ");
        System.out.println(hm.get(s.charAt(2)));


    }
}
