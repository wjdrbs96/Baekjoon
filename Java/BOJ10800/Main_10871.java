package Baekjoon.Java.BOJ10800;

import java.util.Scanner;

public class Main_10871 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        int n = input1.nextInt();  //전체 수
        int m = input1.nextInt();  // 기준 수

        int[] q = new int[n];

        for(int i = 0; i < n; i++){
            q[i] = input1.nextInt();
        }


        for(int j=0; j < n; j++){
            if(q[j] < m){
                System.out.print(q[j] + " ");
            }
        }
    }

}
