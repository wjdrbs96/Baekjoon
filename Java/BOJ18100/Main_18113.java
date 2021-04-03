package Baekjoon.Java.BOJ18100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_18113 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        int max = 0;

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; ++i) {
            int bab = Integer.parseInt(bufferedReader.readLine());
            if (bab > K) {
                if (bab >= 2 * K) {
                    bab = bab - (2 * K);
                }
                else {
                    bab = bab - K;
                }
                list.add(bab);
                max = Math.max(bab, max);
            }
        }

        int left = 1;
        int right = max;
        int number = 0;

        while (left <= right) {
            int mid = (left + right) / 2;

            long sum = 0;

            for (int i : list) {
                sum += i / mid;
            }
            System.out.println(sum);

            // 우리가 원하는 값이기 때문에 갱신
            if (sum >= M) {
                left = mid + 1;
                number = mid;
            }
            else {
                right = mid - 1;
            }
        }

        System.out.println(number != 0 ? number : -1);
    }
}
