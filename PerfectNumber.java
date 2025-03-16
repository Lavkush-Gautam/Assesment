import java.util.Scanner;

public class PerfectNumber {
    static boolean isPerfect(int n) {
        int sum = 0;
        int temp = n;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return temp == sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        if (isPerfect(n)) {
            System.out.println("The numbe is Perfect:" + n);
        } else {
            System.out.println("The numbe is not Perfect:" + n);
        }
        sc.close();
    }

}
