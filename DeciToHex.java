import java.util.Scanner;

public class DeciToHex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int n = sc.nextInt();
        String hex = Integer.toHexString(n);
        System.out.println(hex.toUpperCase());

        sc.close();
    }
}
