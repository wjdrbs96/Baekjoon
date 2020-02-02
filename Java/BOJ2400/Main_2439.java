package Baekjoon.Java.BOJ2400;

import java.util.Scanner;

public class Main_2439 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int j;
        for(int i=n-1; i>=0; i--){
            for(j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int k=n-1; k>=i; k--){
                System.out.print("*");
            }
            System.out.println();
    }
    }
}
