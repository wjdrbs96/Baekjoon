package Algorithm.Backtracking;

import java.util.Scanner;

public class NQueen {
    public static int N;
    public static int count;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        N = input.nextInt();

        for (int i = 1; i <= N; ++i) {
            int[] col = new int[N + 1];

            // 인덱스 0은 쓰지 않음
            col[1] = i;   // N x N 체스판에서 1행1열 ~ 1행 N열 까지 하나 씩 놓으면서 경우의 수 구하기
            dfs(col, 1);

        }
        System.out.println(count);
    }

    public static void dfs(int[] col, int row) {
        if (row == N) {
            count++;    // 1행 1열 ~ 1행 N열 까지 놓을 때 가능한 경우의 수 전부 count
        } else {
            for (int i = 1; i <= N; ++i) {
            col[row + 1] = i;   // col[행] = 열 으로 생각 (ex : col[2] = 1 이라면 2행 1열 이라는 뜻)
            if (isPossible(col, row + 1)) {
                dfs(col, row + 1);
            }
        }
    }

    }

    public static boolean isPossible(int[] col, int row) {
        // 현재 메소드에서 체스를 놓은 행 다음 행에서 놓을 수 있는 자리를 판별해준다.
        for (int i = 1; i < row; ++i) {
            if (col[i] == col[row]) return false; // 같은 열 이면 놓을 수 없기 때문에 false

            if (Math.abs(i - row) == Math.abs(col[i] - col[row])) return false;
            // 대각선을 판별하는 조건은 행끼리 빼기 ==
        }

        return true; // 대각선도 아니고 같은 열도 아니라면 true
    }
}
