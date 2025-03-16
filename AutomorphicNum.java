import java.util.Scanner;

public class AutomorphicNum {
    static int calculateDigit(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    static boolean isAutomorphic(int n) {
        int digit = calculateDigit(n);
        int sq = n * n;
        int zeroes = 1;
        for (int i = 1; i <= digit; i++) {
            zeroes *= 10;
        }
        return n == sq % zeroes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        if (isAutomorphic(n)) {
            System.out.println("Automorphic number");
        } else {
            System.out.println("Not an Automorphic number");
        }

        sc.close();

    }
}
