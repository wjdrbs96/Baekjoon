package Java_Algorithm;

import java.util.Scanner;

public class ScoreTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] list = new int[n];

        for (int i = 0; i < n; ++i) {
            list[i] = input.nextInt();
        }
        int sum =0;
        int count = 0;

        for (int j = 0; j < n; ++j) {
            if (list[j] == 1) {
                count++;
                if (count == 1) {
                    sum+=1;
                }
                else {
                    sum+=count;
                }
            }
            else{
                count = 0;
            }
        }
        System.out.println(sum);

    }
}
