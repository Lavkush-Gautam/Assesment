import java.util.Scanner;

public class NumOfDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        System.out.println("The number of digit is:" + count);

        sc.close();

    }
}
