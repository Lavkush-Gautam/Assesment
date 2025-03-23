import java.util.Arrays;

public class MaxProduct {

    static int scalerProduct(int num1[], int num2[]) {
        int ans = 0;
        for (int i = 0; i < num1.length; i++) {
            ans += num1[i] * num2[i];
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] num1 = { 10, 30, 50, 20 };
        Arrays.sort(num1);
        int[] num2 = { 2, 4, 5, 1 };
        Arrays.sort(num2);
        int result = scalerProduct(num1, num2);
        System.out.println("The minimum Scaler product:" + result);
    }

}
