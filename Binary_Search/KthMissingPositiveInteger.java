package Binary_Search;

import java.util.Scanner;

public class KthMissingPositiveInteger {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        System.out.println(findMissingNumber(n, arr, k));

        sc.close();
    }

    static int findMissingNumber(int n, int arr[], int k) {
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int missing = arr[mid] - (mid + 1);
            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return k + low;
        // OR return k + high + 1; since, low = high + 1
    }
}
