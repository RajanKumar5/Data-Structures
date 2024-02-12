package Binary_Search;

import java.util.Scanner;

public class MinDaysToMakeMBouquets {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(findMinDays(n, arr, k, m));

        sc.close();
    }

    static int findMinDays(int n, int arr[], int k, int m) {
        int minDays = 0;
        int low = 1;
        int high = findPeakDay(n, arr);

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (findTotalBouquets(n, arr, k, mid) >= m) {
                minDays = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }

        return minDays;
    }

    static int findPeakDay(int n, int arr[]) {
        int peak = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            peak = Math.max(peak, arr[i]);
        }

        return peak;
    }

    static int findTotalBouquets(int n, int arr[], int k, int days) {
        int totalBouquets = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] - days <= 0) {
                count++;
            } else {
                count = 0;
            }

            if (count == k) {
                totalBouquets++;
                count = 0;
            }
        }

        return totalBouquets;
    }
}
