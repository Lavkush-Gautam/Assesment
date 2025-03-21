import java.util.Scanner;

public class OctToDec {
    static int getDecimal(int n) {
        int dec = 0;
        int p = 0;
        while (n > 0) {
            int r = n % 10;
            dec += r * Math.pow(8, p);
            n = n / 10;
            p++;
        }
        return dec;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        System.out.println("decimal num is:" + getDecimal(n));
        sc.close();

    }
}
