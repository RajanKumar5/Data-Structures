import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountAllSubarrayWithGivenSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        System.out.println(countSubarray(n, arr, k));

        sc.close();
    }

    static int countSubarray(int n, int arr[], int k) {
        int count = 0;

        Map<Integer, Integer> freqMap = new HashMap<>();
        freqMap.put(0, 1);

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];

            int rem = sum - k;
            count += freqMap.getOrDefault(rem, 0);

            freqMap.put(sum, freqMap.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
