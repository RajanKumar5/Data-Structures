package Basic_Maths;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(findGCD(m, n));

        sc.close();
    }

    static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }

        return findGCD(b, a % b);
    }
}
