package Baekjoon.Java.BOJ1400;
import java.util.HashSet;
import java.util.Scanner;

public class Main_1453 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] list = new int[n];
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < n; ++i) {
            list[i] = input.nextInt();
            hs.add(list[i]);
        }

        System.out.println(list.length - hs.size());

    }
}
