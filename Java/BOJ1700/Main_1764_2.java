package Baekjoon.Java.BOJ1700;

import java.util.*;
import java.util.stream.Stream;

public class Main_1764_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();   // 듣도 못한 사람의 수
        int M = input.nextInt();   // 보도 못한 사람의 수

        Map<String, Integer> map = new HashMap<>();

        for (int i = 1; i < M + 1; ++i) {
            map.put(input.next(), 1);
        }

        List<String> list = new ArrayList<>();
        for (int i = 1; i < N + 1; ++i) {
            String name = input.next();
            if (map.get(name) != null) {
                list.add(name);
            }
        }

        Stream<String> sorted = list.stream().sorted();
        System.out.println(list.size());
        sorted.forEach(s -> System.out.println(s));
    }
}
