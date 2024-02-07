package Binary_Search;

import java.util.Scanner;

public class SQRTOfANumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(findSquareRoot(n));

        sc.close();
    }

    static int findSquareRoot(int n) {
        int sqrt = -1;

        int low = 1;
        int high = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if ((mid * mid) <= n) {
                sqrt = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return sqrt;
    }
}
