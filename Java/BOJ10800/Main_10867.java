package Baekjoon.Java.BOJ10800;

import java.util.*;

public class Main_10867 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; ++i) {
            set.add(input.nextInt());
        }
        Iterator it = set.iterator();

        while (it.hasNext()) {
            list.add((Integer) it.next());
        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); ++i) {
            System.out.print(list.get(i) + " ");
        }


    }
}
