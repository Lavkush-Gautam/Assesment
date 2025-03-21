import java.util.Scanner;

public class DecToBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number:");
        int n = sc.nextInt();
        int num = n;
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            int r = num % 2;
            sb.append(r);
            num = num / 2;
        }
        System.out.println(sb.reverse().toString());

        sc.close();
    }
}
