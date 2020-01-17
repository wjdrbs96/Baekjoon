package Java_Algorithm;

import java.util.Scanner;

public class R2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int R1 = input.nextInt();
        int s = input.nextInt();
        int R2 = s*2 - R1;
        System.out.println(R2);
    }
}
