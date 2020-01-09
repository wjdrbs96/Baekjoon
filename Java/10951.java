package Algorithm;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        while(input.hasNextInt()){  //int 형인 것만 while 루트 들어감
            int a = input.nextInt();
            int b = input.nextInt();
            System.out.println(a+b);
        }
    }
}
