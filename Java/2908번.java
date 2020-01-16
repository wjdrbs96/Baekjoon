package Java_Algorithm;

import java.util.Scanner;

public class Const {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuffer p = new StringBuffer(input.next());
        StringBuffer q = new StringBuffer(input.next());

        p.reverse();
        q.reverse();

        for (int i = 0; i < p.length(); ++i) {
            if ((int)(p.charAt(i)) < (int)(q.charAt(i))) {
                System.out.println(q.toString());
                break;
            }

            else if ((int)(p.charAt(i)) > (int)(q.charAt(i))) {
                System.out.println(p.toString());
                break;
            }

            else {
                continue;
            }
        }


    }
}
