import java.util.Scanner;

public class ShakeHand {

    static int calculate(int n) {
        int totalHandshke = 0;
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                totalHandshke++;
            }
        }
        return totalHandshke;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter peoples:");
        int n = sc.nextInt();
        int handshkes = calculate(n);
        System.out.println(handshkes);

        sc.close();
    }
}
