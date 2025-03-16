import java.util.Scanner;

public class FriendlyPair {
    static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    static boolean isFriendly(int n1, int n2) {
        int sumOfnum1 = calculateSum(n1);
        int sumOfnum2 = calculateSum(n2);

        return (sumOfnum1 / n1) == (sumOfnum2 / n2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if (isFriendly(n1, n2)) {
            System.out.println("friendly Pair");
        } else {
            System.out.println("not friendly Pair");
        }
        sc.close();
    }
}
