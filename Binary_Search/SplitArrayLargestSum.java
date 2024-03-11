package Binary_Search;

import java.util.Scanner;

public class SplitArrayLargestSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        System.out.println(getMinimizedLargestSum(n, arr, k));

        sc.close();
    }

    static int getMinimizedLargestSum(int n, int arr[], int k) {
        int low = arr[0];
        int high = findTotalValue(n, arr);

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int totalPartitions = getTotalPartitions(n, arr, mid);

            if (totalPartitions > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    static int getTotalPartitions(int n, int arr[], int limit) {
        int partition = 1;
        int currVal = 0;

        for (int i = 0; i < n; i++) {
            if (currVal + arr[i] <= limit) {
                currVal += arr[i];
            } else {
                currVal = arr[i];
                partition++;
            }
        }

        return partition;
    }

    static int findMaxValue(int n, int arr[]) {
        int maxValue = 0;

        for (int i = 0; i < n; i++) {
            maxValue = Math.max(maxValue, arr[i]);
        }

        return maxValue;
    }

    static int findTotalValue(int n, int arr[]) {
        int total = 0;

        for (int i = 0; i < n; i++) {
            total += arr[i];
        }

        return total;
    }

}
