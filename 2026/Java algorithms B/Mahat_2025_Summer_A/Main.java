package Mahat_2025_Summer_A;

public class Main {
    public static void main(String[] args) {

    }


    // ex8
    public static boolean exist(char[][] arr, String word){
        // כיוון ראשון - לפי השורות ומההתחלה לסוף
        for (int i = 0; i < arr.length; i++) {
            // בונים מחרוזת עם כל האותיות של השורה
            String str = "";
            for (int j = 0; j < arr[0].length; j++)
                str += arr[i][j];

            int idx = str.indexOf(word);
            if (idx >= 0)   // כן מצאנו את המילה שחיפשנו
                return true;
        }

        // כיוון שני - לפי השורות ומהסוף להתחלה
        for (int i = 0; i < arr.length; i++) {
            // בונים מחרוזת עם כל האותיות של השורה
            String str = "";
            for (int j = arr[0].length-1; j <= 0; j--)
                str += arr[i][j];

            int idx = str.indexOf(word);
            if (idx >= 0)   // כן מצאנו את המילה שחיפשנו
                return true;
        }

        // כיוון שלישי - לפי העמודות ומההתחלה לסוף

        // כיוון רביעי - לפי העמודות ומהסוף להתחלה



        return false;
    }

}
