package Baekjoon.Java.BOJ2900;

import java.util.Scanner;

public class Main_2941 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        String[] list = {"c=","c-","dz=","d-","lj","nj","s=","z="};

        for (int i = 0; i < 8; ++i) {
            s = s.replace(list[i],"?");
        }

        System.out.println(s.length());

    }
}
