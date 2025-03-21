import java.util.Scanner;

public class BinToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number:");
        String bin = sc.nextLine();
        int octal = Integer.parseInt(bin, 2);

        System.out.println("Octal equivalent of binary number is：" + octal);

        sc.close();

    }

}
