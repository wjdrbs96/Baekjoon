package Baekjoon.Java.BOJ2900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * created by Gyunny 2022/01/14
 */
public class Main_2992 {
    private static String X;
    private static StringBuilder sb = new StringBuilder();
    private static final List<Integer> list = new ArrayList<>();
    private static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        X = br.readLine();
        visit = new boolean[X.length() + 1];
        dfs(0);

        Collections.sort(list);

        boolean check = true;
        for (Integer integer : list) {
            if (Integer.parseInt(X) < integer) {
                System.out.println(integer);
                check = false;
                break;
            }
        }

        if (check) {
            System.out.println("0");
        }
    }

    private static void dfs(int depth) {
        if (depth == X.length()) {
            list.add(Integer.parseInt(sb.toString()));
            return;
        }

        for (int i = 1; i <= X.length(); ++i) {
            if (!visit[i]) {
                visit[i] = true;
                sb.append(X.charAt(i - 1));
                dfs(depth + 1);
                visit[i] = false;
                sb.delete(sb.length() - 1, sb.length());
            }
        }

    }

}
