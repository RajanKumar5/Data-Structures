import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubarrayWithSumZero {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(getSubArrayLength(n, arr));

        sc.close();
    }

    static int getSubArrayLength(int n, int arr[]) {
        int maxLength = 0;
        Map<Long, Integer> prefixSum = new HashMap<>();
        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum == 0) {
                maxLength = Math.max(maxLength, i + 1);
            } else if (prefixSum.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - prefixSum.get(sum));
            } else {
                prefixSum.put(sum, i);
            }
        }

        return maxLength;
    }
}
