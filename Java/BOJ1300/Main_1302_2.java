package Baekjoon.Java.BOJ1300;

import java.util.*;

public class Main_1302_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        Map<String, Integer> hm = new HashMap<>();

        for (int i = 0; i < n; ++i) {
            String a = input.next();
            if (hm.get(a) == null) {
                hm.put(a, 1);
            }
            else {
                hm.put(a, hm.get(a) + 1);
            }
        }

        int max = 0;
        List<String> list = new ArrayList<>(hm.keySet());
        Collections.sort(list);

        for (int k : hm.values()) {
            max = Math.max(max, k);
        }

        for (String t : list) {
            if (hm.get(t) == max) {
                System.out.println(t);
                break;
            }
        }

    }
}
