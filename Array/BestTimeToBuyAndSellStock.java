import java.util.Scanner;

public class BestTimeToBuyAndSellStock {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(getMaximumProfit(n, arr));

        sc.close();
    }

    static int getMaximumProfit(int n, int arr[]) {
        int maxProfit = Integer.MIN_VALUE;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            minPrice = Math.min(arr[i], minPrice);
            maxProfit = Math.max(maxProfit, arr[i] - minPrice);
        }

        return maxProfit < 0 ? 0 : maxProfit;
    }
}
