package Baekjoon.Java.BOJ2700;

/*
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main_2751 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n ; ++i) {
            list.add(input.nextInt());
        }

        Collections.sort(list);

        for (Integer s : list) {
            System.out.println(s);
        }
    }
}*/

// 위에는 시간초과 밑에는 겨우 성공 sort 내부 구현이 다른가? 화딱지

import java.util.Arrays;
import java.util.Scanner;

public class Main_2751 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }
    }
}
