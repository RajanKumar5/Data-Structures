package Basic_Maths;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(checkArmstrong(n));

        sc.close();
    }

    static boolean checkArmstrong(int n) {
        int newNum = 0;
        int tmp = n;

        int numLength = String.valueOf(n).length();

        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            newNum += Math.pow(digit, numLength);
        }

        return newNum == tmp;
    }
}
