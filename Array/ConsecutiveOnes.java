import java.util.Scanner;

public class ConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(getMaxConsecutiveOnes(arr));

        sc.close();
    }

    static int getMaxConsecutiveOnes(int arr[]) {
        int max = Integer.MIN_VALUE;
        int curr = 0;

        for (int i : arr) {
            if (i == 0) {
                max = Math.max(max, curr);
                curr = 0;
            } else {
                curr++;
            }
        }

        max = Math.max(max, curr);

        return max;
    }
}
