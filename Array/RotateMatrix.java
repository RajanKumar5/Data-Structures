// Rotate matrix by 90 degree

import java.util.Arrays;
import java.util.Scanner;

public class RotateMatrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        rotateMatrix(n, arr);

        for (int row[] : arr) {
            System.out.println(Arrays.toString(row));
        }

        sc.close();
    }

    static void rotateMatrix(int n, int arr[][]) {
        // in order to rotate a matrix we need to follow 2 steps..
        // 1. Transpose the array (row becomes column & the column becomes row)
        // 2. Reverse each row in the matrix

        // TRASNPOSE
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                int tmp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = tmp;
            }
        }

        // REVERSE
        for (int i = 0; i < n; i++) {
            int start = 0;
            int end = n - 1;
            while (start < end) {
                int tmp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = tmp;

                start++;
                end--;
            }
        }
    }
}
