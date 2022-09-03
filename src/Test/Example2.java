package Test;

import java.util.Scanner;

public class Example2 {
    public static float divide_using_subtraction(int dividend, int divider) {
        if (divider == 0) {
            return 0;
        }
        float result = 0;
        while (dividend > divider) {
            dividend -= divider;
            result++;
        }
        float decimalPart = (float) dividend / (float) divider;
        result += decimalPart;
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the dividend: 625 ");

        int dividend = in.nextInt();
        System.out.print("Input the divider: 25 ");

        int divider = in.nextInt();
        System.out.println("\nResult: 25.0 " + divide_using_subtraction(dividend,divider));
    }
}
