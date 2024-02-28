package exercises;

public class FunctionsExerciss {
    public static void main(String[] args) {

        // ex1 - String Palindrome
        System.out.println(isPali("abaaba"));
        System.out.println(isPali("aabbbbaa"));
        System.out.println(isPali("aabbbcaa"));

        isPaliNum(1234321);
    }
    
    public static boolean isPali(String str){
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length()-i-1))
                return false;
        }
        return true;
    }
    public static boolean isPali(int num){
        String str = String.valueOf(num);
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length()-i-1))
                return false;
        }
        return true;
    }
    public static int lengthOfNumber(int num){
        int length = 0;
        while (num > 0){
            length++;
            num /= 10;
        }
        return length;
    }

    // num = 1234321
    // result = 1230
    public static boolean isPaliNum(int num){
        int temp = num;
        int result = 0;
        for (int i = 0; i < lengthOfNumber(num) / 2; i++) {
            int digit = temp % 10;
            temp /= 10;

            result += digit;
            result *= 10;
        }
        System.out.println(result);

        return true;
    }
}
