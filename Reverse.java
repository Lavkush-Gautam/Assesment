public class Reverse {
    static void reverseArray(int[] arr) {
        int s = 0, e = arr.length - 1;
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        reverseArray(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
