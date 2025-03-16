import java.util.Scanner;

public class PerfectSquare {
    static boolean isPerfectSquare(int n) {
        int x = (int) Math.sqrt(n);

        return x * x == n;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        if (isPerfectSquare(n)) {
            System.out.println("The numbe is Perfect square:" + n);
        } else {
            System.out.println("The numbe is not Perfect square:" + n);
        }
        sc.close();
    }
}
