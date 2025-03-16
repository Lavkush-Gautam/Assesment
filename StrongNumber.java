import java.util.Scanner;

public class StrongNumber {
    static int factorial(int r) {
        if (r == 0)
            return 1;
        int fact = 1;
        for (int i = 1; i <= r; i++) {
            fact *= i;
        }
        return fact;
    }

    static boolean isStrong(int n) {
        int sum = 0;
        int temp = n;
        while (n > 0) {
            int r = n % 10;
            sum += factorial(r);
            n = n / 10;
        }
        return temp == sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        if (isStrong(n)) {
            System.out.println("The numbe is Strong:" + n);
        } else {
            System.out.println("The numbe is not Strong:" + n);
        }
        sc.close();
    }
}
