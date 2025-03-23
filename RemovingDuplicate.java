import java.util.HashSet;
import java.util.Set;

public class RemovingDuplicate {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 2, 3, 1, 2, 6 };
        Set<Integer> st = new HashSet<>();
        for (int num : arr) {
            st.add(num);
        }
        System.out.println(st);
    }
}
