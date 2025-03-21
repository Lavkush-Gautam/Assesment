import java.util.Scanner;

public class HexToDec {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        String hex = sc.nextLine();
        int decimal = Integer.parseInt(hex, 16);
        System.out.println("Decimal number is: " + decimal);
        sc.close();
    }
}
