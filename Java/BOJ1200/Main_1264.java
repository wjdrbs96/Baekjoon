package Baekjoon.Java.BOJ1200;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_1264 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Character> list = new ArrayList<>();
        list.add('a'); list.add('A'); list.add('e'); list.add('E'); list.add('o');
        list.add('O'); list.add('i'); list.add('I'); list.add('u'); list.add('U');

        int count = 0;

        while (true) {
            String s = input.nextLine();
            if (s.equals("#")) {
                break;
            }

            for (int i = 0; i < s.length(); ++i) {
                if (list.contains(s.charAt(i))) {
                    count++;
                }
            }
            System.out.println(count);
            count = 0;
        }

    }
}
