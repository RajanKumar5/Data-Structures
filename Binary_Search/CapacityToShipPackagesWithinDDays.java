package Binary_Search;

import java.util.Scanner;

public class CapacityToShipPackagesWithinDDays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findMinWeightCapacity(n, arr, d));

        sc.close();
    }

    static int findMinWeightCapacity(int n, int arr[], int d) {
        int minCapacity = 0;
        int low = findMinWeight(n, arr);
        int high = findMaxWeight(n, arr);

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossibleToShip(n, arr, d, mid)) {
                minCapacity = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return minCapacity;
    }

    static boolean isPossibleToShip(int n, int arr[], int d, int capacity) {
        int totalDays = 0;
        int currWeight = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > capacity) {
                return false;
            }

            if (currWeight + arr[i] == capacity) {
                totalDays++;
                currWeight = 0;
            } else if (currWeight + arr[i] < capacity) {
                currWeight += arr[i];
            } else {
                totalDays++;
                currWeight = arr[i];
            }

            if (totalDays > d) {
                return false;
            }
        }

        if (currWeight != 0) {
            totalDays++;
        }

        if (totalDays > d) {
            return false;
        }

        return true;
    }

    static int findMinWeight(int n, int arr[]) {
        int minWeight = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            minWeight = Math.min(minWeight, arr[i]);
        }

        return minWeight;
    }

    static int findMaxWeight(int n, int arr[]) {
        int maxWeight = 0;

        for (int i = 0; i < n; i++) {
            maxWeight += arr[i];
        }

        return maxWeight;
    }
}
