import java.util.Scanner;

public class OccurenceOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("Enter the digit:");
        int digit = sc.nextInt();
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == digit)
                count++;
            n = n / 10;
        }
        System.out.println("The number " + digit + " occurs " + count + " times");
        sc.close();
    }
}
