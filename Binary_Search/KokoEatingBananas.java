package Binary_Search;

import java.util.Scanner;

public class KokoEatingBananas {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int h = sc.nextInt();
        System.out.println(findMinBananas(n, arr, h));

        sc.close();
    }

    static int findMinBananas(int n, int arr[], int h) {
        int minBanana = Integer.MAX_VALUE;
        int low = 1;
        int high = findMaxPileCapacity(n, arr);

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (findTimeToEatAllBananas(n, arr, mid) <= h) {
                minBanana = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return minBanana;
    }

    static int findTimeToEatAllBananas(int n, int arr[], int capacity) {
        int totalTime = 0;

        for (int i = 0; i < n; i++) {
            totalTime += Math.ceil((double) arr[i] / (double) capacity);
        }

        return totalTime;
    }

    static int findMaxPileCapacity(int n, int arr[]) {
        int maxCapacity = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            maxCapacity = Math.max(maxCapacity, arr[i]);
        }

        return maxCapacity;
    }
}
