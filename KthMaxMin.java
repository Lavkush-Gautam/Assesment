import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KthMaxMin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int k = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        System.out.println("The " + k + "th max element is " + pq.peek());

        PriorityQueue<Integer> min = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            min.add(arr[i]);
            if (min.size() > k) {
                min.poll();
            }
        }
        System.out.println("The " + k + "th min element is " + pq.peek());

        sc.close();

    }
}
