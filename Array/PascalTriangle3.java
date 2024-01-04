import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<List<Integer>> rows = getNRows(n);

        for (List<Integer> row : rows) {
            System.out.println(row);
        }

        sc.close();
    }

    static List<List<Integer>> getNRows(int n) {
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            list.add(new ArrayList<>(generateNthRow(i)));
        }

        return list;
    }

    static List<Integer> generateNthRow(int n) {
        List<Integer> list = new ArrayList<>();

        int ans = 1;
        list.add(ans);
        for (int i = 1; i < n; i++) {
            ans = ans * (n - i);
            ans = ans / i;

            list.add(ans);
        }

        return list;
    }
}
