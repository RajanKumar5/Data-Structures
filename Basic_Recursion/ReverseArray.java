package Basic_Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        reverseArray(0, n - 1, arr);
        System.out.println(Arrays.toString(arr));

        sc.close();
    }

    static void reverseArray(int start, int end, int arr[]) {
        if (start > end) {
            return;
        }

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(start + 1, end - 1, arr);
    }
}
