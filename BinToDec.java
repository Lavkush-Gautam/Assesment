import java.util.Scanner;

public class BinToDec {
    static int getDecimal(String num) {
        int n = num.length();
        int dec = 0;
        int p = 0;
        for (int i = n - 1; i >= 0; i--) {
            char ch = num.charAt(i);
            if (ch == '1') {
                dec += Math.pow(2, p);
            }
            p++;
        }
        return dec;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number::");
        String num = sc.nextLine();
        System.out.println("The decimal number is:" + getDecimal(num));

        sc.close();
    }
}
