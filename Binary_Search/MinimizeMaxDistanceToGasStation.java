package Binary_Search;

import java.util.PriorityQueue;
import java.util.Scanner;

class Pair {
    double first;
    int second;

    Pair(double first, int second) {
        this.first = first;
        this.second = second;
    }
}

public class MinimizeMaxDistanceToGasStation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(minimizeMaxDistance(n, arr, k));

        sc.close();
    }

    static double minimizeMaxDistance(int n, int arr[], int k) {
        PriorityQueue<Pair> priorityQueue = new PriorityQueue<>((a, b) -> Double.compare(b.first, a.first));
        int howManyPlaced[] = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            priorityQueue.add(new Pair(arr[i + 1] - arr[i], i));
        }

        for (int gasStation = 0; gasStation < k; gasStation++) {
            Pair pair = priorityQueue.poll();
            int index = pair.second;

            double initialDiff = arr[index + 1] - arr[index];
            howManyPlaced[index]++;
            double newDifference = initialDiff / (howManyPlaced[index] + 1);

            priorityQueue.add(new Pair(newDifference, index));
        }

        return priorityQueue.peek().first;
    }
}
