import java.util.Scanner;

public class RootsOfQuad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coefficients of the quadratic equation");
        double a = sc.nextDouble();
        if (a == 0) {
            System.out.println("a can not be zero");
        }
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = b * b - 4 * a * c;
        if (d > 0) {
            double r1 = (-b - Math.sqrt(d)) / (2 * a);
            double r2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("The roots of the quadratic equation are " + r1 + " and " + r2);
        } else if (d == 0) {
            double r1 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("The root of the quadratic equation is " + r1);
        } else {
            System.out.println("The roots of the quadratic equation are complex");
        }

        sc.close();

    }
}
