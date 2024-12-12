package exercises;

public class Functions110424 {
    public static void main(String[] args) {

        boolean b = isPrime(9);
        System.out.println(b);
        primeCheck(100);




    }



    public static boolean isPrime(int num){

        for (int i=2; i<num ; i++){
            if (num % i == 0){
                return false;
            }
        }

        return true;
    }

    public static void primeCheck(int num){
        for (int i=1; i<num ; i++){
            System.out.println("Check if "+i + " is prime: "+isPrime(i));
        }
    }
}
