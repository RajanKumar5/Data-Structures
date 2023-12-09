import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int res = findSecondLargest(arr, n);
        System.out.println(res);

        sc.close();
    }

    static int findSecondLargest(int arr[], int n) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > largest) {
                secondLargest = largest;
                largest = i;
            }
            if (i > secondLargest && i != largest) {
                secondLargest = i;
            }
        }

        return secondLargest;
    }
}
