package Java_Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 진짜 개 같은 문제 매우 화남
// 시간초과 계속 떠서 구글링 해서 해결
// 풀이는 쉬우나 시간초과 안뜨는 풀이는 생각못한 문제

public class Main_1764 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < n; ++i) {
            String name = input.next();
            list.add(name);
        }

        Collections.sort(list);
        String[] ary = new String[list.size()];

        ary = list.toArray(ary);

        ArrayList<String> answer = new ArrayList<>();

        for (int j = 0; j < m; ++j) {
            String name = input.next();
            int index = Arrays.binarySearch(ary, name);
            if (index >= 0) {
                answer.add(name);
            }
        }

            Collections.sort(answer);

            System.out.println(answer.size());
            for (String name : answer) {
                System.out.println(name);
            }
        }

}

