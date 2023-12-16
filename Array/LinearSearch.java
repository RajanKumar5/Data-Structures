import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        int res = searchNum(k, n, arr);

        System.out.println(res);

        sc.close();
    }

    static int searchNum(int k, int n, int arr[]) {
        for (int i = 0; i < n; i++) {
            if (k == arr[i]) {
                return i;
            }
        }

        return -1;
    }
}
