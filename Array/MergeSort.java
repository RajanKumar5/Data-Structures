import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MergeSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        mergeSort(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));

        sc.close();
    }

    static void mergeSort(int arr[], int low, int high) {
        if (low == high) {
            return;
        }

        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    static void merge(int arr[], int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        List<Integer> tmp = new ArrayList<>();

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                tmp.add(arr[left]);
                left++;
            } else {
                tmp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            tmp.add(arr[left]);
            left++;
        }

        while (right <= high) {
            tmp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = tmp.get(i - low);
        }
    }
}
