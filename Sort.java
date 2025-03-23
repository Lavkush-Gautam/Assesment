// import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int arr[] = { 3, 1, 5, 6, 4, 2, 8 };
        // Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
