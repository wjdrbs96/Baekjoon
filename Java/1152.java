package Java_Algorithm;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();
        String[] p = s.split(" ");
        int count = 0;
        for (int i = 0; i < p.length; ++i) {
            if (p[i].equals("")) {
                continue;
            }
            else {
                count++;
            }
        }
        System.out.println(count);
    }
}
