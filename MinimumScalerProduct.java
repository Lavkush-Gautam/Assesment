import java.util.Arrays;

public class MinimumScalerProduct {
    static void reverse(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static int scalerProduct(int num1[], int num2[]) {
        int ans = 0;
        for (int i = 0; i < num1.length; i++) {
            ans += num1[i] * num2[i];
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] num1 = { 10, 30, 40, 20 };
        Arrays.sort(num1);
        int[] num2 = { 2, 4, 5, 1 };
        Arrays.sort(num2);
        reverse(num2);
        int result = scalerProduct(num1, num2);
        System.out.println("The minimum Scaler product:" + result);
    }
}
