package Binary_Search;

import java.util.Scanner;

public class CountOccurenceOfNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int first = findFirstPosition(arr, n, k);
        int last = findLastPosition(arr, n, k);

        if (first == -1) {
            System.out.println(0);
        } else {
            int count = last - first + 1;
            System.out.println(count);
        }

        sc.close();
    }

    static int findFirstPosition(int arr[], int n, int k) {
        int firstPosition = -1;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == k) {
                firstPosition = mid;
                high = mid - 1;
            } else if (arr[mid] > k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return firstPosition;
    }

    static int findLastPosition(int arr[], int n, int k) {
        int lastPosition = -1;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == k) {
                lastPosition = mid;
                low = mid + 1;
            } else if (arr[mid] > k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return lastPosition;
    }
}
