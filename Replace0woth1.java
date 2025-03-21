import java.util.Scanner;

public class Replace0woth1 {
    static int rev(int n) {
        int revN = 0;
        while (n > 0) {
            int r = n % 10;
            revN = revN * 10 + r;
            n = n / 10;
        }
        return revN;
    }

    static int change(int n) {
        int res = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 0) {
                res = res * 10 + 1;

            } else {
                res = res * 10 + rem;
            }
            n = n / 10;
        }
        return rev(res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ente the number:");
        int n = sc.nextInt();
        int ans = change(n);
        System.out.println(ans);

        sc.close();
    }
}
