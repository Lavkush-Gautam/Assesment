public class greatestInTwo {
    public static int greatestInTwoNumbr(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = greatestInTwoNumbr(a, b);
        System.out.println("The greatest number is: " + c);
    }
}
