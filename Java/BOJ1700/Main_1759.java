package Baekjoon.Java.BOJ1700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * created by jg 2021/04/18
 */
public class Main_1759 {
    private static int L, C;
    private static String[] list;
    private static boolean[] visit;
    private static StringBuilder sb = new StringBuilder();
    private static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        list = new String[C];
        visit = new boolean[C];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < C; ++i) {
            list[i] = st.nextToken();
        }

        Arrays.sort(list);
        backTracking(0, 0, 0, false);
        System.out.println(result);
    }

    private static void backTracking(int start, int depth, int a, boolean check) {
        if (depth == L) {
            if (a >= 2 && check) {
                result.append(sb).append("\n");
            }
            return;
        }

        for (int i = start; i < C; ++i) {
            if (!visit[i]) {
                visit[i] = true;
                sb.append(list[i]);
                if (list[i].equals("a") || list[i].equals("e") || list[i].equals("i") || list[i].equals("o") || list[i].equals("u")) {
                    backTracking(i + 1, depth + 1, a, true);
                } else {
                    backTracking(i + 1, depth + 1, a + 1, check);
                }

                visit[i] = false;
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }
}
