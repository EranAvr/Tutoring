package exercises;

public class Recursion {
    public static void main(String[] args) {
        countToN(3);
    }

    public static void countToN(int n){
        if (n == 1){    // stopping condition
            System.out.println(n);
            return;
        }

        countToN(n-1);
        System.out.println(n);
    }
}
