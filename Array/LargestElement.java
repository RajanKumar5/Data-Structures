import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = findMaxElement(arr);
        System.out.println(max);

        sc.close();
    }

    static int findMaxElement(int arr[]) {
        int max = Integer.MIN_VALUE;

        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }

        return max;
    }
}
