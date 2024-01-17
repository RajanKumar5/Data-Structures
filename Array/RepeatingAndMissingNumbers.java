import java.util.Arrays;
import java.util.Scanner;

public class RepeatingAndMissingNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(findRepeatingAndMissingNumbers(n, arr)));

        sc.close();
    }

    static int[] findRepeatingAndMissingNumbers(int n, int arr[]) {
        long SN = (n * (n + 1)) / 2;
        long S2N = (n * (n + 1) * (2 * n + 1)) / 6;

        long S = 0;
        long S2 = 0;

        for (int i = 0; i < n; i++) {
            S += arr[i];
            S2 += arr[i] * arr[i];
        }

        long val1 = S - SN; // (x - y)
        long val2 = S2 - S2N; // (x2 - y2) => (x + y)(x - y)

        val2 = val2 / val1; // (x + y)
        long repeating = (val1 + val2) / 2;
        long missing = val2 - repeating;

        return new int[] { (int) repeating, (int) missing };
    }
}
