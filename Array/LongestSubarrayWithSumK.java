import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        System.out.println(findMaxLength(n, k, arr));

        sc.close();
    }

    static int findMaxLength(int n, int k, int arr[]) {
        int maxLength = 0;
        long sum = 0;
        Map<Long, Integer> preSumMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum == k) {
                maxLength = Math.max(maxLength, i + 1);
            }

            long remaining = sum - k;

            if (preSumMap.containsKey(remaining)) {
                int len = i - preSumMap.get(remaining);
                maxLength = Math.max(maxLength, len);
            }

            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        return maxLength;
    }
}
