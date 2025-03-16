import java.util.*;;

public class SumInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int sum = 0;

        for (int i = num1; i <= num2; i++) {
            sum += i;
        }

        System.out.println("Sum of  range" + num1 + " and " + num2 + " is: " + sum);

        sc.close();
    }
}
