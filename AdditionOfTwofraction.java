import java.util.Scanner;

public class AdditionOfTwofraction {
    static int findLcm(int b, int d) {
        return b * d;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first fraction: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter the second fraction: ");
        int c = sc.nextInt();
        int d = sc.nextInt();
        int lcm = findLcm(b, d);
        int sum = a * d + b * c;
        float add = (float) sum / lcm;
        System.out.println(add);

        sc.close();

    }
}
