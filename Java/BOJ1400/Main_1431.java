package Baekjoon.Java.BOJ1400;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main_1431 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt(); // 기타의 개수

        List<String> listString = new ArrayList<>();
        for (int i = 0; i < N; ++i) {
            listString.add(input.next());
        }

        listString.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() < o2.length()) {
                    return -1;
                }
                else if (o1.length() == o2.length()) {
                    int sumO1 = 0;
                    int sumO2 = 0;
                    for (int i = 0; i < o1.length(); ++i) {
                        if (o1.charAt(i) >= 48 && o1.charAt(i) <= 57) {
                            sumO1 += Integer.parseInt(String.valueOf(o1.charAt(i)));
                        }
                        if (o2.charAt(i) >= 48 && o2.charAt(i) <= 57) {
                            sumO2 += Integer.parseInt(String.valueOf(o2.charAt(i)));
                        }
                    }

                    // 숫자가 같으면
                    if (sumO1 == sumO2) {
                        return o1.compareTo(o2);
                    }

                    return Integer.compare(sumO1, sumO2);
                }

                return 1;
            }
        });

        for (int i = 0; i < listString.size(); ++i) {
            System.out.println(listString.get(i));
        }
    }
}
