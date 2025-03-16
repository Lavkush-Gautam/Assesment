import java.util.Scanner;

public class PowerOfN {
    static int powerOfN(int n, int p) {
        int res = 1;
        for (int i = 1; i <= p; i++) {
            res = res * n;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("Enter the power");
        int p = sc.nextInt();
        int result = powerOfN(n, p);
        System.out.println("The result is " + result);
        sc.close();
    }
}
