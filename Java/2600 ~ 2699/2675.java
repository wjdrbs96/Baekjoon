package Java_Algorithm;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        String b = null;
        StringBuffer list = new StringBuffer();
        int n = input.nextInt();
        for (int i = 0; i < n; ++i) {
            a = input.nextInt();
            b = input.next();

            for (int j = 0; j < b.length(); ++j) {
                for (int k = 0; k < a; ++k) {
                    list.append(b.charAt(j));
                }
            }
            System.out.println(list.toString());
            list.delete(0,list.length());
        }
    }
}
