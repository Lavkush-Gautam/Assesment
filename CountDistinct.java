import java.util.HashSet;
import java.util.Set;

public class CountDistinct {
    public static int countDistinct(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        return set.size();
    }

    public static void main(String[] args) {

        int[] nums = { 1, 2, 2, 3, 4, 6, 2 };
        int n = countDistinct(nums);
        System.err.println("The ditinct elements are " + n);
    }
}
