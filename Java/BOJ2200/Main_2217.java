package Baekjoon.Java.BOJ2200;

import java.util.*;

/**
 * created by jg 2021/04/06
 */
public class Main_2217 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; ++i) {
            list.add(input.nextInt());
        }

        Collections.sort(list, Collections.reverseOrder());

        int max = 0;
        for (int i = 0; i < list.size(); ++i) {
            max = Math.max(max, (i + 1) * list.get(i));
        }

        System.out.println(max);
    }
}
