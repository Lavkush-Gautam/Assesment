import java.util.Scanner;

public class NumOfDivisor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range:");
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println("Enter the divisors:");
        int x = sc.nextInt();
        int res = 0;
        for (int i = n; i <= m; i++) {
            int div = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    div++;
                }
            }
            if (div == x) {
                res++;
            }
        }
        System.out.println("The count is:" + res);

        sc.close();
    }
}
