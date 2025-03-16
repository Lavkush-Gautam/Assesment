import java.util.Scanner;

public class GCD {
    static int calculateGcd(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = Math.max(gcd, i);
            }
        }
        return gcd;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two number:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("GCD of two number is:=" + calculateGcd(n1, n2));
        sc.close();
    }
}
