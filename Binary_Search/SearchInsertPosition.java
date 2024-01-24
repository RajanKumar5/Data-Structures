package Binary_Search;

import java.util.Scanner;

public class SearchInsertPosition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int target = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int position = findInsertPosition(n, arr, target);
        System.out.println(position);

        sc.close();
    }

    static int findInsertPosition(int n, int arr[], int target) {
        int pos = n;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] > target) {
                pos = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return pos;
    }
}
