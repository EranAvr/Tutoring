package Mahat.SemiFinal;

public class Ex4 {
    public static void main(String[] args) {

    }

    /*
    public static boolean checkPassword(int password){
        int sum = 0;
        while (password > 0){
            // get single rightmost digit-
            int digit = password % 10;

            if (digit % 2 != 0)
                return false;
            sum += digit;

            password /= 10;
        }
        if (sum > 15)
            return false;

        return true;
    }*/

    // Shorter solution:
    public static boolean checkPassword(int password){
        int sum = 0;
        while (password > 0){

            if (password % 2 != 0)
                return false;
            sum += password % 10;

            password /= 10;
        }
        return !(sum > 15);
    }
}
