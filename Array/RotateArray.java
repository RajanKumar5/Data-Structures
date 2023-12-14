import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        k = k % n;
        rotate(0, n - 1, arr);
        rotate(0, k - 1, arr);
        rotate(k, n - 1, arr);

        System.out.println(Arrays.toString(arr));

        sc.close();
    }

    static void rotate(int start, int end, int arr[]) {
        while (start < end) {
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;

            start++;
            end--;
        }
    }
}
