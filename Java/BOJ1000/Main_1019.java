package Baekjoon.Java.BOJ1000;

import java.util.Scanner;

// 참고하기 https://www.slideshare.net/Baekjoon/baekjoon-online-judge-1019

public class Main_1019 {
    public static void cal(int[] ans, int x, int point) {  // 숫자를 10으로 나누면서 값을 더해줌
        while (x > 0) {
            ans[x % 10] += point;
            x /= 10;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int page = input.nextInt();

        int[] ans = new int[10];
        int point = 1;
        int start = 1;

        while (start <= page) {

            while (page % 10 != 9 && start <= page) {  // 끝자리 9로 만들기
                cal(ans, page, point);  // 끝자리가 9가 되기 전의 숫자들은 전부 count
                page--;
            }

            if (page < start) {
                break;
            }

            while (start % 10 != 0 && start <= page) { // 끝 자리 0로 만들기
                cal(ans, start, point);  // 끝자리가 0이 되기 전의 숫자들은 전부 count
                start++;
            }

            start /= 10;   // 1부터 시작해서 끝자리가 0을 만듬
            page /= 10;    // 입력한 수 가장 가까운 끝자리가 9인 숫자를 만듬

            for (int i = 0; i < 10; ++i) {
                ans[i] += (page - start + 1) * point;
            }

            point *= 10;
        }

        for (int i = 0; i < 10; ++i) {
            System.out.print(ans[i] + " ");
        }

    }
}
