package MoedC;

import java.util.Scanner;

public class Ex161024_a {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // ex1
        // עלינו לקלוט מחרוזת של משפט מהמשתמש,
        // יש לכתוב תוכנית שתחזיר ראשי-תיבות של המשפט
        // הכוונה: מחרוזת חדשה המורכבת מאותיות ראשונות בלבד של כל מילה, ונקודה ביניהן
        String sentence = s.nextLine();
        String newStr = ex1(sentence);
        System.out.println(newStr);

        // ex2
        // נתון מערך מספרים
        // עלינו לכתוב פונקציה, אשר תבצע בדיקות ותחשב שני סכומים:
        // סכום ראשון של חצי ראשון של המערך, סכום שני של חצי אחרון של המערך
        // הפונקציה תחזיר תשובה בוליאנית האם הבדיקות הצליחו והסכומים שווים
        int[] arr = {1,2,3,3,5,2};
        ex2(arr);


    }

    public static String ex1(String str){
        // str = "Hello beautiful lovely world"
        String newStr = "" + str.charAt(0) + ".";
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) == ' '){
                newStr += str.charAt(i+1) + ".";
            }
        }
        return newStr;
    }

    public static boolean ex2(int[] arr){
        // 1. check length is even:
        if (arr.length % 2 != 0){
            return false;
        }
        // 2. length > 4
        if (arr.length < 4){
            return false;
        }
        // 3. check all values are even
        for (int i=0; i<arr.length; i++){
            if (arr[i] % 2 != 0){
                return false;
            }
        }
        // 4. check lower-half sum1 and higher-half sum2
        int sum1 = 0, sum2 = 0;
        for (int i=0; i<arr.length/2; i++){
            sum1 += arr[i];
        }
        for (int i=arr.length/2; i<arr.length; i++){
            sum2 += arr[i];
        }

        if (sum1 == sum2){
            return true;
        }
        else {
            return false;
        }
        // alternative:
        // return sum1 == sum2;
    }
}
