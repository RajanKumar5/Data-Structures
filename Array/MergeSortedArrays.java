import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int j = 0; j < m; j++) {
            b[j] = sc.nextInt();
        }

        mergeArray(n, a, m, b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        sc.close();
    }

    static void mergeArray(int n, int a[], int m, int b[]) {
        int len = m + n;
        int gap = (len / 2) + (len % 2);

        while (gap > 0) {
            int left = 0;
            int right = left + gap;

            while (right < len) {
                // arr1 and arr2
                if (left < n && right >= n) {
                    swapIfGreater(a, b, left, right - n);
                }
                // both in arr2
                else if (left >= n) {
                    swapIfGreater(b, b, left - n, right - n);
                }
                // both in arr1
                else {
                    swapIfGreater(a, a, left, right);
                }
                left++;
                right++;
            }

            if (gap == 1) {
                break;
            } else {
                gap = (gap / 2) + (gap % 2);
            }
        }
    }

    static void swapIfGreater(int a[], int b[], int ind1, int ind2) {
        if (a[ind1] > b[ind2]) {
            int tmp = a[ind1];
            a[ind1] = b[ind2];
            b[ind2] = tmp;
        }
    }
}
