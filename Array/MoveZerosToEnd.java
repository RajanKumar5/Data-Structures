import java.util.Arrays;
import java.util.Scanner;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        moveZeros(arr, n);

        System.out.println(Arrays.toString(arr));

        sc.close();
    }

    static void moveZeros(int arr[], int n) {
        // finding first zero
        int zero = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zero = i;
                break;
            }
        }

        if (zero == -1) {
            return;
        }

        for (int i = zero + 1; i < n; i++) {
            if (arr[i] != 0) {
                int tmp = arr[i];
                arr[i] = arr[zero];
                arr[zero] = tmp;

                zero++;
            }
        }
    }
}
