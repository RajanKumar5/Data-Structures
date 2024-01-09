import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FourSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long target = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        List<List<Integer>> list = fourSum(n, arr, target);
        for (List<Integer> ls : list) {
            System.out.println(ls);
        }

        sc.close();
    }

    static List<List<Integer>> fourSum(int n, int arr[], long target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < n; j++) {
                if (j != i + 1 && arr[j] == arr[j - 1]) {
                    continue;
                }

                int k = j + 1;
                int l = n - 1;

                while (k < l) {
                    int sum = arr[i] + arr[j] + arr[k] + arr[l];
                    if (sum < target) {
                        k++;
                    } else if (sum > target) {
                        l--;
                    } else {
                        List<Integer> tmp = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
                        list.add(tmp);
                        k++;
                        l--;

                        while (k < l && arr[k] == arr[k - 1]) {
                            k++;
                        }
                        while (k < l && arr[l] == arr[l + 1]) {
                            l--;
                        }
                    }
                }
            }
        }

        return list;
    }
}
