import java.util.Scanner;

public class AbundantNumber {

    static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    static boolean isAbundant(int n) {
        int sum = calculateSum(n);
        return sum > n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        if (isAbundant(n)) {
            System.out.println("The number is abundant");
        } else {
            System.out.println("The number is not Abundant");
        }
        sc.close();
    }
}
