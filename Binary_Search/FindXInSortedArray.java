package Binary_Search;

import java.util.Scanner;

public class FindXInSortedArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        System.out.println(findElement(n, arr, target));

        sc.close();
    }   

    static int findElement(int n, int arr[], int target){
        int low = 0;
        int high = n - 1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] == target){
                return mid;
            }
            else if (arr[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return -1;
    }
}
