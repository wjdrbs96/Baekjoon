package Baekjoon.Java.BOJ2500;

import java.util.*;

public class Main_2592 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<Integer, Integer> hm = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        int sum = 0;
        for (int i = 0; i < 10; ++i) {
            int a = input.nextInt();
            list.add(a);
            sum += a;
            if (!hm.containsKey(a)) {
                hm.put(a, 1);
            }
            else {
                hm.put(a, hm.get(a) + 1);
            }
        }

        System.out.println(sum / 10);

        int maxValue = Collections.max(hm.values());

        for (int i = 0; i < list.size(); ++i) {
            if (hm.get(list.get(i)) == maxValue) {
                System.out.println(list.get(i));
                break;
            }
        }


    }
}
