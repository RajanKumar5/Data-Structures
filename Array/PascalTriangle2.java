import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> list = getNthRow(n);

        System.out.println(list);

        sc.close();
    }

    static List<Integer> getNthRow(int n) {
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
