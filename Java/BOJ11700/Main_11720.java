package Baekjoon.Java.BOJ11700;

import java.util.*;

public class Main_11720 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        int sum=0;
        String line = scan.next();

        for(int i=0; i<num; i++) {
            sum += line.charAt(i)-'0';
        }

        System.out.println(sum);
    }
}