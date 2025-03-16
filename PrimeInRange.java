public class PrimeInRange {
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int start = 1;
        int end = 10;
        System.out.println("Prime numbers between " + start + " and " + end + " are");
        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                System.out.println("prime number is" + num);
            } else {
                System.out.println("Not a prime number" + num);
            }
        }
    }

}
