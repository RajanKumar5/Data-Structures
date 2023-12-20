import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        System.out.println(findPair(arr, n, k));
        System.out.println(doesPairExists(arr, n, k));

        sc.close();
    }

    // TC => O(NlogN)
    // SC => O(N)
    static boolean findPair(int arr[], int n, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int rem = k - arr[i];
            if (map.containsKey(rem)) {
                return true;
            }

            map.put(arr[i], i);
        }

        return false;
    }

    // solving without using map data structure... hence saving space
    // TC => O(NlogN)
    // SC => O(1)
    static boolean doesPairExists(int arr[], int n, int k) {
        int start = 0;
        int end = n - 1;

        Arrays.sort(arr);

        while (start < end) {
            int curr = arr[start] + arr[end];
            if (curr == k) {
                return true;
            } else if (curr < k) {
                start++;
            } else {
                end--;
            }
        }

        return false;
    }
}
