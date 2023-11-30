package Basic_Recursion;

import java.util.Scanner;

public class PrintNameNTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();

        printName(0, n, str);

        sc.close();
    }

    static void printName(int curr, int n, String name) {
        if (curr == n) {
            return;
        }

        System.out.print(name + " ");
        printName(curr + 1, n, name);
    }
}
