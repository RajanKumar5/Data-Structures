import java.util.Arrays;
import java.util.Scanner;

public class AlternateNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(generateNewArray(n, arr)));

        sc.close();
    }

    static int[] generateNewArray(int n, int arr[]) {
        int res[] = new int[n];
        int pos = 0;
        int neg = 1;

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                res[pos] = arr[i];
                pos += 2;
            } else {
                res[neg] = arr[i];
                neg += 2;
            }
        }

        return res;
    }
}
