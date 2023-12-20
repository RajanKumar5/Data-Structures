import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfZeroOneTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sortArray(arr, n);
        System.out.println(Arrays.toString(arr));

        sc.close();
    }

    static void sortArray(int arr[], int n) {
        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {
            int num = arr[mid];

            if (num == 0) {
                int tmp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = tmp;
                mid++;
                low++;
            }
            if (num == 1) {
                mid++;
            }
            if (num == 2) {
                int tmp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = tmp;

                high--;
            }
        }
    }
}
