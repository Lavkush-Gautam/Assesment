import java.util.Scanner;

public class Palindrom {

    public static boolean isPalindrom(int n) {
        int temp = n;
        int sum = 0;
        while (n > 0) {
            int r = n % 10;
            sum = sum * 10 + r;
            n = n / 10;
        }
        return (temp == sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isPalindrom(n)) {
            System.out.println("The number is palindrom");
        } else {
            System.out.println("The number is not palindrom");
        }
        sc.close();
    }
}
