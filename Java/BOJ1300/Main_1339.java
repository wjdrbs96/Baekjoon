package Baekjoon.Java.BOJ1300;

import java.util.*;

public class Main_1339 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        List<String> stringList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; ++i) {
            stringList.add(input.next());
        }

        stringList.forEach(sb::append);

        SortedMap<Character, Integer> hm = new TreeMap<>();


        for (int i = 0; i < sb.length(); ++i) {
            if (hm.get(sb.charAt(i)) == null) {
                hm.put(sb.charAt(i), 1);
            } else {
                hm.put(sb.charAt(i), hm.get(sb.charAt(i)) + 1);
            }
        }

        int value = 10 - hm.size();  // size 가 4라면 6 부터  6, 7, 8, 9

        Map<Character, Integer> valueMap = new HashMap<>();

        for (Character ch : hm.keySet()) {
            valueMap.putIfAbsent(ch, value);
            value++;
        }

        valueMap.values().forEach(s -> System.out.println(s));

        int sum = 0;
        for (int i = 0; i < stringList.size(); ++i) {
            String s = stringList.get(i);
            StringBuilder alphaBuilder = new StringBuilder();
            for (int j = 0; j < s.length(); ++j) {
                alphaBuilder.append(String.valueOf(valueMap.get(s.charAt(j))));
            }
            System.out.println(alphaBuilder.toString());
            sum += Integer.parseInt(alphaBuilder.toString());
        }

        System.out.println(sum);


    }
}
