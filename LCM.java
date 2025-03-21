import java.util.Scanner;

public class LCM {
    static int calLcm(int n1, int n2) {
        int max = Math.max(n1, n2);
        int lcm = max;
        while (true) {
            if (lcm % n1 == 0 && lcm % n2 == 0) {
                break;
            }
            lcm += max;
        }
        return lcm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the two numbers:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("The lcm of n1 and n2 is:" + calLcm(n1, n2));

        sc.close();

    }
}
