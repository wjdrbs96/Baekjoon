package Baekjoon.Java.BOJ11700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

/**
 * created by Gyunny 2021/12/13
 */
public class Main_11728_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] listA = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; ++i) {
            listA[i] = Integer.parseInt(st.nextToken());
        }

        int[] listB = new  int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; ++i) {
            listB[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(listA);
        Arrays.sort(listB);
        int[] result = new int[N + M];
        int left = 0;
        int right = 0;
        int i = 0;
        while (left < listA.length && right < listB.length) {
            if (listA[left] < listB[right]) {
                result[i++] = listA[left++];
            } else {
                result[i++] = listB[right++];
            }
        }

        while (left < listA.length) {
            result[i++] = listA[left++];
        }

        while (right < listB.length) {
            result[i++] = listB[right++];
        }

        System.out.println(Arrays.stream(result).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
    }
}
