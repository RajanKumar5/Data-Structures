package Binary_Search;

import java.util.Scanner;

public class SmallestDivisor {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int limit = sc.nextInt();
        System.out.println(findSmallestDivisor(n, arr, limit));

        sc.close();
    }

    static int findSmallestDivisor(int n, int arr[], int limit) {
        int smallestDivisor = Integer.MAX_VALUE;
        int low = 1;
        int high = findMaxElement(n, arr);

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (findArraySum(n, arr, mid) <= limit) {
                smallestDivisor = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return smallestDivisor;
    }

    static int findArraySum(int n, int arr[], int divisor) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += Math.ceil((double) arr[i] / (double) divisor);
        }

        return sum;
    }

    static int findMaxElement(int n, int arr[]) {
        int maxElement = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            maxElement = Math.max(maxElement, arr[i]);
        }

        return maxElement;
    }
}
