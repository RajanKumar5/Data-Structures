package Basic_Recursion;

import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(getSumOfNumbers(n));

        sc.close();
    }

    static long getSumOfNumbers(long n) {
        if (n == 0) {
            return 0;
        }

        return n + getSumOfNumbers(n - 1);
    }
}
