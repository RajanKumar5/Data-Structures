package Basic_Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        solve(0, n, arr);
        System.out.println(Arrays.toString(arr));

        sc.close();
    }

    static void solve(int index, int n, int arr[]) {
        if (index == n) {
            return;
        }

        arr[index] = index + 1;
        solve(index + 1, n, arr);
    }
}
