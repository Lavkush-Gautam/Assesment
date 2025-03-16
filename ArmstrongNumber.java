import java.util.Scanner;

public class ArmstrongNumber {
    static int totaldigit(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static boolean isArmstrong(int n) {
        int sum = 0;
        int temp = n;
        int digit = 0;
        while (temp != 0) {
            digit = temp % 10;
            sum = sum + (int) Math.pow(digit, totaldigit(n));
            temp = temp / 10;
        }
        return n == sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        if (isArmstrong(n)) {
            System.out.println("The number is armstrong:");
        } else {
            System.out.println("The number is not Armstrong");
        }
        sc.close();
    }
}
