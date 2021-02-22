package Baekjoon.Java.BOJ1000;

import java.util.HashMap;
import java.util.Scanner;

public class Main_1076 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] color = new String[3];
        for (int i = 0; i < 3; ++i) {
            color[i] = input.next();
        }
        StringBuilder st = new StringBuilder();
        HashMap<String, String> hm = new HashMap<>();

        hm.put("black", "0");
        hm.put("brown", "1");
        hm.put("red", "2");
        hm.put("orange", "3");
        hm.put("yellow", "4");
        hm.put("green", "5");
        hm.put("blue", "6");
        hm.put("violet", "7");
        hm.put("grey", "8");
        hm.put("white", "9");

        for (int j = 0; j < color.length - 1; ++j) {
            for (String key : hm.keySet()) {
                if (color[j].equals(key)) {
                    st.append(hm.get(key));
                }
            }
        }

        long a = (long) Math.pow(10, Integer.parseInt(hm.get(color[2])));
        System.out.println(a);
        a = a * Integer.parseInt(st.toString());
        System.out.println(a);

    }
}
