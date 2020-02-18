package Baekjoon.Java.BOJ2900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2902 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name = br.readLine();
        String[] list = name.split("-");

        for (int i = 0; i < list.length; ++i) {
            System.out.print(list[i].charAt(0));
        }

    }
}
