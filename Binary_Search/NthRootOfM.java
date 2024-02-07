package Binary_Search;

import java.util.Scanner;

public class NthRootOfM {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(findNthRootOfM(n, m));

        sc.close();
    }

    static int findNthRootOfM(int n, int m) {
        int low = 1;
        int high = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (Math.pow(mid, n) == m) {
                return mid;
            } else if (Math.pow(mid, n) < m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
