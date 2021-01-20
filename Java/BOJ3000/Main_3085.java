package Baekjoon.Java.BOJ3000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_3085 {
    static int N, result = -1;
    static char[][] list;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        list = new char[N + 1][N + 1];

        for (int i = 1; i <= N; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            for (int j = 0; j < s.length(); ++j) {
                list[i][j + 1] = s.charAt(j);
            }
        }

        for (int i = 1; i <= N; ++i) {
            for (int j = 1; j < N; ++j) {
                // 자리 바꾸기
                positionChange(i, j, i, j + 1);
                result = Math.max(result, checkCount());
                // 원래대로 만들기
                positionChange(i, j, i, j + 1);
            }
        }

        for (int j = 1; j <= N; ++j) {
            for (int i = 1; i < N; ++i) {
                // 자리 바꾸기
                positionChange(i, j, i + 1, j);
                result = Math.max(result, checkCount());
                // 원래대로 만들기
                positionChange(i, j, i + 1, j);
            }
        }

        System.out.println(result);
    }

    static int checkCount() {
        int maxValue = 1;

        for (int i = 1; i <= N; ++i) {
            int temp = 1;
            for (int j = 2; j <= N; ++j) {
                if (list[i][j - 1] == list[i][j]) {
                    temp++;
                } else {
                    maxValue = Math.max(maxValue, temp);
                    temp = 1;
                }
            }
            maxValue = Math.max(maxValue, temp);
        }

        for (int j = 1; j <= N; ++j) {
            int temp = 1;
            for (int i = 2; i <= N; ++i) {
                if (list[i - 1][j] == list[i][j]) {
                    temp++;
                } else {
                    maxValue = Math.max(maxValue, temp);
                    temp = 1;
                }
            }
            maxValue = Math.max(maxValue, temp);
        }
        return maxValue;
    }

    static void positionChange(int i, int j, int p, int q) {
        // 인접한 사탕 위치 변경
        char temp = list[i][j];
        list[i][j] = list[p][q];
        list[p][q] = temp;
    }
}
