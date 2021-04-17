package Baekjoon.Java.BOJ1300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * created by jg 2021/04/17
 */
public class Main_1342 {
    private static String s;
    private static boolean[] visit;
    private static int count;
    private static int[] alpha;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        s = br.readLine();
        visit = new boolean[s.length()];
        alpha = new int[26];

        for (int i = 0; i < s.length(); ++i) {
            ++alpha[s.charAt(i) - 'a'];
        }

        backTracking(0);

        for (int i = 0; i < 26; ++i) {
            if (alpha[i] > 1) {
                count /= factorial(alpha[i]);
            }
        }

        System.out.println(count);
    }

    private static int factorial(int n) {
        if (n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    private static void backTracking(int depth) {
        if (depth == s.length()) {
            int check = 0;
            for (int i = 0; i < sb.length() - 1; ++i) {
                if (sb.charAt(i) != sb.charAt(i + 1)) {
                    check++;
                }
                else {
                    break;
                }
            }
            if (check == sb.length() - 1) {
                count++;
            }
            return;
        }

        for (int i = 0; i < s.length(); ++i) {
            if (!visit[i]) {
                visit[i] = true;
                sb.append(s.charAt(i));
                backTracking(depth + 1);
                sb.deleteCharAt(sb.length() - 1);
                visit[i] = false;
            }
        }
    }
}