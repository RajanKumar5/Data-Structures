package Basic_Maths;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = solve(n);

        System.out.println(result);

        sc.close();
    }

    static int solve(int n) {
        int count = 0;
        int num = n;

        while (n > 0) {
            int digit = n % 10;
            n = n / 10;

            if (digit == 0) {
                continue;
            }

            if (num % digit == 0) {
                count++;
            }
        }

        return count;
    }
}
