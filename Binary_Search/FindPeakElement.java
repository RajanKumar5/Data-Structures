package Binary_Search;

import java.util.Scanner;

public class FindPeakElement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findPeakElement(n, arr));

        sc.close();
    }

    static int findPeakElement(int n, int arr[]) {
        if (n == 1) {
            return 0;
        }
        if (arr[0] > arr[1]) {
            return 0;
        }
        if (arr[n - 1] > arr[n - 2]) {
            return n - 1;
        }

        int low = 1;
        int high = n - 2;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                return mid;
            }
            if (arr[mid] > arr[mid - 1]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
