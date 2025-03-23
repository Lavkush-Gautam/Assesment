import java.util.HashSet;
import java.util.Set;

public class UnionInter {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 4, 5, 6, 7, 8 };

        System.out.println("Union of the two arrays:");
        int[] union = findUnion(arr1, arr2);
        for (int num : union) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Intersection of the two arrays:");
        int[] intersection = findIntersection(arr1, arr2);
        for (int num : intersection) {
            System.out.print(num + " ");
        }
    }

    public static int[] findUnion(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr1) {
            set.add(num);
        }
        for (int num : arr2) {
            set.add(num);
        }
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }
        return result;
    }

    public static int[] findIntersection(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int num : arr1) {
            set1.add(num);
        }
        for (int num : arr2) {
            if (set1.contains(num)) {
                set2.add(num);
            }
        }
        int[] result = new int[set2.size()];
        int i = 0;
        for (int num : set2) {
            result[i++] = num;
        }
        return result;
    }
}