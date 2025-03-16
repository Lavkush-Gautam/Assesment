import java.util.Scanner;

public class HarshedNumber {
    static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            int r = n % 10;
            sum += r;
            n = n / 10;
        }
        return sum;
    }

    static boolean isHarshedNumber(int n) {
        int sum = digitSum(n);

        return n % sum == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        if (isHarshedNumber(n)) {
            System.out.println("harshed Number");
        } else {
            System.out.println("Not a Harshed Number");
        }

        sc.close();

    }
}
