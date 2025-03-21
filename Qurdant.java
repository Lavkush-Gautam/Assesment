import java.util.Scanner;

public class Qurdant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Axis:");
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("The first quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("The second quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("The third quadrant");
        } else if (x > 0 && y < 0) {
            System.out.println("The fourth quadrant");
        } else if (x != 0 && y == 0) {
            System.out.println("The X-axis");
        } else if (x == 0 && y != 0) {
            System.out.println("The Y-axis");
        } else {
            System.out.println("Origin");
        }

        sc.close();

    }
}
