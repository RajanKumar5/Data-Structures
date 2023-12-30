import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SuperiorElements {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        List<Integer> list = findSuperiorElements(n, arr);
        System.out.println(list);

        sc.close();
    }

    static List<Integer> findSuperiorElements(int n, int arr[]) {
        List<Integer> list = new ArrayList<>();

        int max = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                list.add(arr[i]);
            }
        }

        return list;
    }
}
