package Basic_Maths;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfAllDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(getDivisorSum(n));

        sc.close();
    }

    static int getDivisorSum(int n) {
        int divisorSum = 0;

        for (int i = 1; i <= n; i++) {
            List<Integer> divisorList = getDivisorList(i);
            for (int div : divisorList) {
                divisorSum += div;
            }
        }

        return divisorSum;
    }

    static List<Integer> getDivisorList(int n) {
        List<Integer> divisorList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisorList.add(i);
            }
        }

        return divisorList;
    }
}
