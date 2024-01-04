import java.util.Scanner;

public class PascalTriangle1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        System.out.println(getElement(row, col));

        sc.close();
    }

    static int getElement(int row, int col) {
        return (int) nCr(row - 1, col - 1);
    }

    static long nCr(int n, int r) {
        int res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }

        return res;
    }
}
