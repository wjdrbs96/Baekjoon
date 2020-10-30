package Baekjoon.Java.BOJ13700;

import java.util.Scanner;

// 시간 초과
public class Main_13713 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.next(); // 문자열 S
        int M = input.nextInt(); // 쿼리의 개수

        for (int i = 0; i < M; ++i) {
            int count = 0;
            int num = input.nextInt();

            String sub1 = s.substring(0, num);
            int len = sub1.length(); // substring length
            String sub2 = s.substring(s.length() - len);

            for (int j = sub1.length() - 1; j >= 0; --j) {
                if (sub1.charAt(j) == sub2.charAt(j)) {
                    count++;
                }
                else {
                    break;
                }
            }
            System.out.println(count);
        }
    }
}
