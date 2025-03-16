import java.util.Scanner;

public class ReverseNumber {
    public static int reverseNumber(int n) {
        int rev = 0;
        while (n != 0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reversedNumber = reverseNumber(num);
        System.out.println("Reversed Number: " + reversedNumber);

        sc.close();
    }
}
