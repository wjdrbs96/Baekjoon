package Java_Algorithm;

import java.util.Scanner;

public class Alpha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        char[] alpha = new char[26];  //alpha
        int[] l = new int[26];   //count
        for (int i = 0; i < 26; ++i) {
            l[i] = 0;
            alpha[i] = (char) (97 + i);
        }

        for (int j = 0; j < s.length(); ++j) {
            for (int k = 0; k < 26; ++k) {
                if (s.charAt(j) == alpha[k]) {
                    l[k]+=1;
                    break;
                }
            }
        }

        for (int q : l) {
            System.out.print(q + " ");
        }
    }
}
