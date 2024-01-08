import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ThreeSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        List<List<Integer>> res = findTriplets(n, arr);
        for (List<Integer> ls : res) {
            System.out.println(ls);
        }

        sc.close();
    }

    static List<List<Integer>> findTriplets(int n, int arr[]) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];

                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    List<Integer> tmp = Arrays.asList(arr[i], arr[j], arr[k]);
                    list.add(new ArrayList<>(tmp));
                    j++;
                    k--;

                    while (j < k && arr[j] == arr[j - 1]) {
                        j++;
                    }
                    while (j < k && arr[k] == arr[k + 1]) {
                        k--;
                    }
                }
            }
        }

        return list;
    }
}
