import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberOfInversions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int res = countInversions(arr, n);
        System.out.println(res);

        sc.close();
    }

    static int countInversions(int arr[], int n) {
        int res = mergeSort(arr, 0, n - 1);
        return res;
    }

    static int mergeSort(int arr[], int low, int high) {
        int count = 0;

        if (low == high) {
            return count;
        }

        int mid = (low + high) / 2;
        count += mergeSort(arr, low, mid);
        count += mergeSort(arr, mid + 1, high);
        count += merge(arr, low, mid, high);

        return count;
    }

    static int merge(int arr[], int low, int mid, int high) {
        int count = 0;
        List<Integer> tmp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                tmp.add(arr[left]);
                left++;
            } else {
                tmp.add(arr[right]);
                right++;
                count += ((mid - left) + 1);
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

        return count;
    }
}
