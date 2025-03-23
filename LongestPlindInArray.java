public class LongestPlindInArray {
    static boolean isPalindrom(int n) {
        int temp = n;
        int sum = 0;
        while (temp != 0) {
            int rem = temp % 10;
            sum = sum * 10 + rem;
            temp /= 10;
        }
        System.out.println(sum);
        return sum == n;

    }

    public static void main(String[] args) {
        int arr[] = { 11, 212, 53453, 123, 1236123 };
        int max = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max && isPalindrom(arr[i]))

            {
                max = arr[i];
                index = i;
            }
        }
        System.out.println("Longest palindromic number is " + max + " at index " + index);

    }
}