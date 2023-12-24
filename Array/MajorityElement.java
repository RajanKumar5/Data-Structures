import java.util.Scanner;

public class MajorityElement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findMajorityElement(n, arr));

        sc.close();
    }

    static int findMajorityElement(int n, int arr[]) {
        int count = 0;
        int element = 0;

        for (int i = 0; i < n; i++) {
            if (count == 0) {
                count = 1;
                element = arr[i];
            } else if (arr[i] == element) {
                count++;
            } else {
                count--;
            }
        }

        int elementCount = 0;
        for (int i : arr) {
            if (i == element) {
                elementCount++;
            }
        }

        if (elementCount > n / 2) {
            return element;
        }

        return -1;
    }
}
