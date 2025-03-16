import java.util.Scanner;

public class PrimeFactor {

    static boolean isPrime(int n) {
        if (n == 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            if (isPrime(i) && (n % i == 0)) {
                System.out.println(i + " ");
            }
        }

        sc.close();
    }
}
