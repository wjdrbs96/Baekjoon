package Java_Algorithm;

import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String N = input.next();
        int F = input.nextInt();
        int a;

       N = N.substring(0,N.length()-2);
       N = N + "00";

       a = Integer.parseInt(N);

       while (true) {
           if (a % F == 0) {
               String b = String.valueOf(a);
               System.out.println(b.substring(b.length()-2));
               break;
           }
           a++;
       }
    }
}
