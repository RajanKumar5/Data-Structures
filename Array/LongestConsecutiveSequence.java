import java.util.Arrays;
import java.util.Scanner;

public class LongestConsecutiveSequence {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(getLongestSequence(n, arr));

        sc.close();
    }

    static int getLongestSequence(int n, int arr[]) {
        int max = 0;
        int curr = 1;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int i = 1; i < n; i++) {
            if (arr[i] - arr[i - 1] == 1) {
                curr++;
            } else {
                max = Math.max(curr, max);
                curr = 1;
            }
        }

        max = Math.max(max, curr);

        return max;
    }
}
