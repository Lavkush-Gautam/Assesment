import java.util.Scanner;

public class ArmstrongInRange {
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
        System.out.println("Enter the number1:");
        int n1 = sc.nextInt();
        System.out.println("Enter the number2:");
        int n2 = sc.nextInt();
        for (int i = n1; i <= n2; i++) {
            if (isArmstrong(i)) {
                System.out.println("The number is Armstrong" + i);
            } else {
                System.out.println("The number is not Armstrong" + i);
            }
        }

        sc.close();
    }
}
