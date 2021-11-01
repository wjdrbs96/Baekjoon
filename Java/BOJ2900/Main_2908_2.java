package Baekjoon.Java.BOJ2900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * created by Gyunny 2021/11/01
 */
public class Main_2908_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();

        StringBuilder sbA = new StringBuilder(a);
        sbA.reverse();

        StringBuilder sbB = new StringBuilder(b);
        sbB.reverse();

        int aInt = Integer.parseInt(sbA.toString());
        int bInt = Integer.parseInt(sbB.toString());

        if (aInt < bInt) {
            System.out.println(bInt);
        } else {
            System.out.println(aInt);
        }
    }
}
