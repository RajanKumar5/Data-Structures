package Basic_Maths;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(solve(n));

        sc.close();
    }

    static int solve(int n) {
        boolean isNegative = n < 0;
        if (isNegative) {
            n = n * -1;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(n));
        sb.reverse();

        int res = Integer.parseInt(sb.toString());
        if (isNegative) {
            res = res * -1;
        }

        return res;
    }
}
