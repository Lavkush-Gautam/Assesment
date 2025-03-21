import java.util.Scanner;

public class Permutation {
    static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    static int Npr(int n, int r) {
        int st = factorial(n);
        int ch = factorial(n - r);
        int ans = st / ch;
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Students:");
        int n = sc.nextInt();
        System.out.println("Enter the numer of chairs:");
        int r = sc.nextInt();

        int perm = Npr(n, r);
        System.out.println(perm);
        sc.close();

    }

}
