import java.util.Scanner;

public class NthtermFebo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth number:");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(b);
        sc.close();
    }
}
