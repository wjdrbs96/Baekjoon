package Baekjoon.Java.BOJ2900;

import java.util.*;

public class Main_2979 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();

        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Map<Integer, Integer> hm = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        int Astart = input.nextInt();
        int Aend = input.nextInt();
        for (int i = Astart; i < Aend; ++i) {
            list.add(i);
        }

        int Bstart = input.nextInt();
        int Bend = input.nextInt();
        for (int i = Bstart; i < Bend; ++i) {
            list.add(i);
        }

        int Cstart = input.nextInt();
        int Cend = input.nextInt();
        for (int i = Cstart; i < Cend; ++i) {
            list.add(i);
        }


        for (int i = 0; i < list.size(); ++i) {
            if (!list2.contains(list.get(i))) {
                list2.add(list.get(i));
            }
        }
        for (int i = 0; i < list.size(); ++i) {
            if (!hm.containsKey(list.get(i))) {
                hm.put(list.get(i), 1);
            }
            else {
                hm.put(list.get(i), hm.get(list.get(i)) + 1);
            }

        }

        int sum = 0;

        for (int i = 0; i < list2.size(); ++i) {
            if (hm.get(list2.get(i)) == 1) {
                sum += hm.get(list2.get(i)) * A;
            }
            else if (hm.get(list2.get(i)) == 2) {
                sum += hm.get(list2.get(i)) * B;
            }
            else if (hm.get(list2.get(i)) == 3) {
                sum += hm.get(list2.get(i)) * C;
            }
        }

        System.out.println(sum);


    }
}
