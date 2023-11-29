package Basic_Maths;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(isPalindrome(n));

        sc.close();
    }

    static boolean isPalindrome(int n) {
        int reversedNum = 0;
        int tmp = n;

        while (tmp > 0) {
            int digit = tmp % 10;
            tmp = tmp / 10;
            reversedNum = reversedNum * 10 + digit;
        }

        return reversedNum == n;
    }
}
