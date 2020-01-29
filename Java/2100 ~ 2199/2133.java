package Java_Algorithm;

import java.util.Scanner;

public class Main_2133 {
    static int[] d = new int[1001];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        System.out.println(dp(n));
    }

    public static int dp(int x) {
        if (x == 0) return 1;
        if (x == 1) return 0;
        if (x == 2) return 3;
        if (d[x] != 0) return d[x];

        int result = 3 * dp(x - 2);
        for (int i = 3; i <= x; ++i) {
            if (i % 2 == 0) {
                result += 2 * dp(x - i);
            }
        }
        return d[x] = result;
    }
}
