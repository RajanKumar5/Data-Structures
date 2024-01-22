import java.util.Scanner;

public class MaximumProductSubarray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.err.println(findMaximumubarrayProduct(n, arr));

        sc.close();
    }

    static int findMaximumubarrayProduct(int n, int arr[]) {
        int maxProduct = Integer.MIN_VALUE;
        int prefix = 1;
        int suffix = 1;

        for (int i = 0; i < n; i++) {
            if (prefix == 0) {
                prefix = 1;
            }
            if (suffix == 0) {
                suffix = 1;
            }

            prefix *= arr[i];
            suffix *= arr[n - 1 - i];

            maxProduct = Math.max(maxProduct, Math.max(prefix, suffix));
        }

        return maxProduct;
    }
}
