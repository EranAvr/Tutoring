package Ex080226_Pretest;

public class PrimeFactors {
    public static void main(String[] args) {
        printPrimes(10);
        printPrimes(20);
        printPrimes(50);

    }

    public static boolean isPrime(int n){
        for (int i = 2; i < n/2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void printPrimes(int n){
        System.out.println("Check: " + n);
        int limit = n;
        for (int i = 2; i <= limit/2; i++) {
            if (isPrime(i) && n%i==0){    // מצאנו ראשוני שמחלק את n
                int count = 0;
                while (n%i==0 && n > 1){
                    count++;
                    n /= i;
                }
                System.out.println("Prime divider: " + i + " with exponent: " + count);
            }
        }
    }
}
