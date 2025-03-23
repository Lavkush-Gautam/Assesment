import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radious:");
        float r = sc.nextFloat();
        float area = (float) 3.14 * r * r;

        System.out.println("The area is:" + area);

        sc.close();
    }
}
