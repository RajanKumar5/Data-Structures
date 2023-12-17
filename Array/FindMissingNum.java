import java.util.Scanner;

public class FindMissingNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findMissing(n, arr));

        sc.close();
    }

    static int findMissing(int n, int arr[]) {
        int missing = 0;

        for (int i = 0; i <= n; i++) {
            missing ^= i;
        }

        for (int i : arr) {
            missing ^= i;
        }

        return missing;
    }
}
