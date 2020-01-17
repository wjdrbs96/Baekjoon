package Java_Algorithm;

import java.math.BigDecimal;
import java.util.Scanner;

public class Pow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigDecimal val = input.nextBigDecimal();

        int scale = input.nextInt();
        BigDecimal result = val.pow(scale);
        System.out.println(result.toPlainString());
    }
}
