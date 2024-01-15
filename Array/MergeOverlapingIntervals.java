import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MergeOverlapingIntervals {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[][] = new int[n][2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        List<List<Integer>> intervals = mergeIntervals(n, arr);
        for (List<Integer> inetrval : intervals) {
            System.out.println(inetrval);
        }

        sc.close();
    }

    static List<List<Integer>> mergeIntervals(int n, int arr[][]) {
        List<List<Integer>> intervals = new ArrayList<>();

        Arrays.sort(arr, (o1, o2) -> {
            return o1[0] - o2[0];
        });

        int start = arr[0][0];
        int end = arr[0][1];

        for (int i = 1; i < n; i++) {
            int a = arr[i][0];
            int b = arr[i][1];

            if (a <= end) {
                end = Math.max(b, end);
            } else {
                List<Integer> tmp = Arrays.asList(start, end);
                intervals.add(tmp);
                start = a;
                end = b;
            }
        }

        List<Integer> tmp = Arrays.asList(start, end);
        intervals.add(tmp);

        return intervals;
    }

}
