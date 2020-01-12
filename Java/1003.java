
import java.util.Scanner;

// 오래걸린 문제 백준 1003번

public class B1003 {

    public static void main(String[] args) {
        int q = 41;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] count = new int[q][2];
        int test;

        count[0][0] = 1; count[0][1] = 0;
        count[1][0] = 0; count[1][1] = 1;

        for(int j=2; j<q; j++){
            for(int k=0; k<2; k++){
                count[j][k] = count[j-2][k] + count[j-1][k];
            }
        }

        for(int p=0; p<n; p++){
            test = input.nextInt();
            System.out.println(count[test][0] + " " +count[test][1]);
        }
    }

}
