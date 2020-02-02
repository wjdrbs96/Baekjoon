package Baekjoon.Java.BOJ10800;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main_10817 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        list.add(input.nextInt());
        list.add(input.nextInt());
        list.add(input.nextInt());

        Collections.sort(list);
        System.out.println(list.get(1));
    }
}
