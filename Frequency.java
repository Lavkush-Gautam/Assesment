import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of an array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to find the frequency:");
        int choice = sc.nextInt();
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int num : arr) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        System.out.println("Frequency of elements in the array:");
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getKey() == choice) {
                System.out.println("The frequeny is:" + entry.getValue());
            }
        }

        sc.close();
    }
}
