package Java_Algorithm;

import java.util.Scanner;

public class WordStudy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next().toUpperCase();

        int[] count = new int[26];
        int max = 0;
        char result = '?';

        for (int i = 0; i < s.length(); ++i) {
            count[s.charAt(i) - 65]++;
            if (max < count[s.charAt(i)-65]) {
                max = count[s.charAt(i)-65];
                result = s.charAt(i);
            } else if (max == count[s.charAt(i)-65]) {
                result = '?';
            }
        }
        System.out.println(result);
    }
}
