package Pattern;

import java.util.Scanner;

/*

    *
   ***
  *****
 *******
*********

*/

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        print(n);

        sc.close();
    }

    static void print(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            for (int l = 0; l < n - 1 - i; l++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
