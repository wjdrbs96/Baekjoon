package Baekjoon.Java.BOJ3000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * created by Gyunny 2021/10/26
 */
public class Main_3085_2 {
    private static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        char[][] list = new char[N][N];

        for (int i = 0; i < N; ++i) {
            String input = br.readLine();
            for (int j = 0; j < input.length(); ++j) {
                list[i][j] = input.charAt(j);
            }
        }

        int ans = 0;
        char tmp = ' ';
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                if (j + 1 < N) {
                    // 오른쪽 꺼와 위치 변경
                    tmp = list[i][j];
                    list[i][j] = list[i][j + 1];
                    list[i][j + 1] = tmp;

                    int max = calculateCandy(list);

                    if (ans < max) {
                        ans = max;
                    }

                    // 원상 복구
                    tmp = list[i][j + 1];
                    list[i][j + 1] = list[i][j];
                    list[i][j] = tmp;
                }

                if (i + 1 < N) {
                    // 아래꺼와 위치 변경
                    tmp = list[i][j];
                    list[i][j] = list[i + 1][j];
                    list[i + 1][j] = tmp;
                    int max = calculateCandy(list);

                    if (ans < max) {
                        ans = max;
                    }

                    // 원상 복구
                    tmp = list[i][j];
                    list[i][j] = list[i + 1][j];
                    list[i + 1][j] = tmp;
                }

            }
        }

        System.out.println(ans);

    }

    private static int calculateCandy(char[][] list) {
        // 최대 값 저장 용
        int ans = 1;
        for (int i = 0; i < list.length; ++i) {
            int count = 1;
            // 오른쪽에 있는 것이랑 비교
            for (int j = 1; j < list.length; ++j) {
                if (list[i][j] == list[i][j - 1]) {
                    count += 1;
                } else {
                    // 새로 갱신
                    count = 1;
                }

                if (ans < count) {
                    ans = count;
                }
            }

            // 초기화
            count = 1;
            // 세로로 비교
            for (int j = 1; j < list.length; ++j) {
                if (list[j][i] == list[j - 1][i]) {
                    count += 1;
                } else {
                    count = 1;
                }

                // 최대 값 판별
                if (ans < count) {
                    ans = count;
                }
            }
        }

        return ans;
    }
}
