package Binary_Search;

import java.util.Scanner;

public class NumberOfRotations {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findNumberOfRotations(arr, n));

        sc.close();
    }

    static int findNumberOfRotations(int arr[], int n) {
        int index = -1;
        int min = Integer.MAX_VALUE;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[low] <= arr[mid]) {
                if (arr[low] < min) {
                    min = arr[low];
                    index = low;
                }
                low = mid + 1;
            } else {
                if (arr[mid] < min) {
                    min = arr[mid];
                    index = mid;
                }
                high = mid - 1;
            }
        }

        return index;
    }
}
