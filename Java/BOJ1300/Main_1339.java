package Baekjoon.Java.BOJ1300;

import java.util.*;

public class Main_1339 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<Character, Integer> hm = new HashMap<>();

        int n = input.nextInt();

        List<String> strings = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            strings.add(input.next());
        }

        // 길이가 긴게 앞으로 정렬
        strings.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });

        for (int i = 0; i < strings.size(); ++i) {
            String word = strings.get(i);

        }

        input.close();
    }
}
