package Binary_Search;

import java.util.Arrays;
import java.util.Scanner;

public class CeilAndFloor {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int floor = findFloor(arr, n, x);
        int ceil = findCeil(arr, n, x);

        System.out.println(Arrays.toString(new int[] { floor, ceil }));

        sc.close();
    }

    static int findFloor(int arr[], int n, int x) {
        int floor = -1;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] <= x) {
                floor = arr[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return floor;
    }

    static int findCeil(int arr[], int n, int x) {
        int ceil = -1;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= x) {
                ceil = arr[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ceil;
    }
}
