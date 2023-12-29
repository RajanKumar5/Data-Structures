import java.util.Arrays;
import java.util.Scanner;

public class NextPermutation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        generateNextPermutation(n, arr);
        System.out.println(Arrays.toString(arr));

        sc.close();
    }

    static void generateNextPermutation(int n, int arr[]) {
        int index = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            int start = 0;
            int end = n - 1;
            while (start < end) {
                swap(start, end, arr);
                start++;
                end--;
            }

            return;
        }

        for (int i = n - 1; i > index; i--) {
            if (arr[i] > arr[index]) {
                swap(index, i, arr);
                break;
            }
        }

        int start = index + 1;
        int end = n - 1;
        while (start < end) {
            swap(start, end, arr);
            start++;
            end--;
        }
    }

    static void swap(int a, int b, int arr[]) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}