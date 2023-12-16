import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Union {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int b[] = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        List<Integer> list = mergeArray(n, a, m, b);
        System.out.println(list);

        sc.close();
    }

    static List<Integer> mergeArray(int n, int a[], int m, int b[]) {
        List<Integer> list = new ArrayList<>();

        int i = 0;
        int j = 0;
        int prev = -1;
        while (i < n && j < m) {
            if (i == 0 && j == 0) {
                if (a[i] < b[j]) {
                    list.add(a[i]);
                    prev = a[i];
                    i++;
                } else {
                    list.add(b[j]);
                    prev = b[j];
                    j++;
                }
            } else {
                if (a[i] < b[j]) {
                    if (a[i] != prev) {
                        list.add(a[i]);
                        prev = a[i];
                    }
                    i++;
                } else {
                    if (b[j] != prev) {
                        list.add(b[j]);
                        prev = b[j];
                    }
                    j++;
                }
            }
        }

        while (i < n) {
            if (a[i] != prev) {
                list.add(a[i]);
                prev = a[i];
            }
            i++;
        }

        while (j < m) {
            if (b[j] != prev) {
                list.add(b[j]);
                prev = b[i];
            }
            j++;
        }

        return list;
    }
}
