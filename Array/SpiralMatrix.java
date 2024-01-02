import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        List<Integer> list = getSpiralArray(n, m, arr);
        System.out.println(list);

        sc.close();
    }

    static List<Integer> getSpiralArray(int n, int m, int arr[][]) {
        List<Integer> list = new ArrayList<>();

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = m - 1;

        while (top <= bottom && left <= right) {
            // right
            for (int i = left; i <= right; i++) {
                list.add(arr[top][i]);
            }
            top++;

            // bottom
            for (int i = top; i <= bottom; i++) {
                list.add(arr[i][right]);
            }
            right--;

            // left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(arr[bottom][i]);
                }
                bottom--;
            }

            // top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(arr[i][left]);
                }
                left++;
            }
        }

        return list;
    }
}
