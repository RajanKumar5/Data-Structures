package Binary_Search;

import java.util.Scanner;

public class BookAllocation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findMinPages(n, arr, m));

        sc.close();
    }

    static int findMinPages(int n, int arr[], int m) {
        int minPages = 0;
        int low = findMaxPageInABook(n, arr);
        int high = findTotalPages(n, arr);

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int totalStudents = getTotalStudents(n, arr, mid);
            if (totalStudents == m) {
                minPages = mid;
                high = mid - 1;
            } else if (totalStudents < m) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }

        return minPages;
    }

    static int getTotalStudents(int n, int arr[], int capacity) {
        int student = 1;
        int totalPages = 0;

        for (int i = 0; i < n; i++) {
            if (totalPages + arr[i] <= capacity) {
                totalPages += arr[i];
            } else {
                totalPages = arr[i];
                student++;
            }
        }

        return student;
    }

    static int findMaxPageInABook(int n, int arr[]) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }

        return max;
    }

    static int findTotalPages(int n, int arr[]) {
        int totalPages = 0;

        for (int i = 0; i < n; i++) {
            totalPages += arr[i];
        }

        return totalPages;
    }
}
