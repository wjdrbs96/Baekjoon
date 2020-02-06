package Baekjoon.Java.BOJ2800;

import java.util.*;

public class Main_2822 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<Integer, Integer> hm = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int[] number = new int[5];  // 가장 점수가 높은 곳의 인덱스 저장

        for (int i = 0; i < 8; ++i) {
            list.add(input.nextInt());
            hm.put(list.get(i), i + 1);
        }

        Collections.sort(list);
        Collections.reverse(list);

        int sum = 0;
        for (int i = 0; i < 5; ++i) {
            sum += list.get(i);
            number[i] = hm.get(list.get(i));
        }

        Arrays.sort(number);
        System.out.println(sum);

        for (int i = 0; i < 5; ++i) {
            System.out.print(number[i] + " ");
        }
    }
}
