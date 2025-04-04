import java.util.Scanner;

public class TwoPrime {
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;

    }

    static boolean express(int n) {
        for (int i = 2; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isPrime(i) && isPrime(j) && i + j == n) {
                    return true;
                }

            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        if (express(n)) {
            System.out.println(n + " is sum of a two prime number");
        } else {
            System.out.println(n + " is not sum of a two prime number");
        }

        sc.close();
    }
}
