import java.util.Scanner;

public class DeciToOct {
    static int deciToOct(int n) {
        int octal = 0;
        int base = 1;
        int temp = n;
        while (temp > 0) {
            int remainder = temp % 8;
            octal = octal + (remainder * base);
            temp = temp / 8;
            base = base * 10;
        }
        return octal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number");
        int n = sc.nextInt();
        int octal = deciToOct(n);
        System.out.println("Octal equivalent of " + n + " is " + octal);

        sc.close();
    }
}
