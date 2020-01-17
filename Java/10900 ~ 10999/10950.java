package Algorithm;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i=0; i<n; i++){
            int a = input.nextInt();
            int b = input.nextInt();
            System.out.println(a+b);
        }
    }
}
