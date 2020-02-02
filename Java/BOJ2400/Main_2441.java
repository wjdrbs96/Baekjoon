package Baekjoon.Java.BOJ2400;

import java.util.Scanner;

public class Main_2441 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i,j,k;
        int n = input.nextInt();

        for(i=n; i>=1; i--){
            for(k=0; k<n-i; k++){
                System.out.print(" ");
            }
            for(j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
