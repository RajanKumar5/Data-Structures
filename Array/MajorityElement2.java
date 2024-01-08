import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MajorityElement2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        List<Integer> list = findMajorityElements(n, arr);
        System.out.println(list);

        sc.close();
    }

    static List<Integer> findMajorityElements(int n, int arr[]) {
        List<Integer> list = new ArrayList<>();

        int count1 = 0;
        int count2 = 0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = arr[i];
            if (count1 == 0 && num != el2) {
                el1 = num;
                count1++;
            } else if (count2 == 0 && num != el1) {
                el2 = num;
                count2++;
            } else if (num == el1) {
                count1++;
            } else if (num == el2) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        // checking if the elements are majority elements or not
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == el1) {
                count1++;
            }
            if (arr[i] == el2) {
                count2++;
            }
        }

        int min = n / 3;
        if (count1 > min) {
            list.add(el1);
        }
        if (count2 > min) {
            list.add(el2);
        }

        return list;
    }
}
