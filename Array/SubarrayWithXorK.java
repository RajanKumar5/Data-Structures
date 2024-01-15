import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubarrayWithXorK {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = countSubarrayWithXorK(n, arr, k);
        System.out.println(ans);

        sc.close();
    }

    static int countSubarrayWithXorK(int n, int arr[], int k) {
        int count = 0;
        int xor = 0;
        Map<Integer, Integer> preXor = new HashMap<>();
        preXor.put(xor, 1);

        for (int i = 0; i < n; i++) {
            xor ^= arr[i];

            int rem = xor ^ k;
            if (preXor.containsKey(rem)) {
                count += preXor.get(rem);
            }

            preXor.put(xor, preXor.getOrDefault(xor, 0) + 1);
        }

        return count;
    }
}
