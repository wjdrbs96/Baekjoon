package Baekjoon.Java.BOJ13400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * created by jg 2021/04/10
 */
public class Main_13417 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; ++i) {
            int N = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());
            List<String> list = new LinkedList<>();
            list.add(st.nextToken());

            for (int j = 1; j < N; ++j) {
                String input = st.nextToken(); // 넣을 것

                String first = list.get(0);

                if (first.charAt(0) < input.charAt(0)) {
                    list.add(input);
                }
                else {
                    list.add(0, input);
                }
            }
            list.forEach(System.out::print);
            System.out.println();
        }
    }
}
