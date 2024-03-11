package Binary_Search;

import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCows {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findMinDistance(n, arr, k));

        sc.close();
    }

    static int findMinDistance(int n, int arr[], int k) {
        int minDistance = Integer.MAX_VALUE;
        Arrays.sort(arr);
        int low = 0;
        int high = arr[n - 1];

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(n, arr, k, mid)) {
                minDistance = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return minDistance;
    }

    static boolean isPossible(int n, int arr[], int k, int distance) {
        int totalPlaced = 1;
        int lastPosition = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] - lastPosition >= distance) {
                totalPlaced++;
                lastPosition = arr[i];
            }
        }

        if (totalPlaced >= k) {
            return true;
        }

        return false;
    }
}
