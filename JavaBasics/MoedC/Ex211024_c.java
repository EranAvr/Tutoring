package MoedC;


import java.util.Scanner;

public class Ex211024_c {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // ex1


        // ex2

        // ex3
        System.out.println(isCopyK("ABCDABCDABCD", "ABCD"));
        System.out.println(isCopyK("ABCDABCDABCZ", "ABCD"));
        System.out.println(isCopyK_2("ABCDABCDABCD", "ABCD"));
        System.out.println(isCopyK_2("ABCDABCDABCZ", "ABCD"));
        System.out.println(isCopyK_3("ABCDABCDABCD", "ABCD"));
        System.out.println(isCopyK_3("ABCDABCDABCZ", "ABCD"));
    }

    // ex1
    public static void ex1(){
        Scanner s = new Scanner(System.in);
        // קליטת מספרים
        int[] arr = new int[35];
        System.out.println("Enter 35 numbers");
        for (int i=0; i< arr.length; i++){
            arr[i] = s.nextInt();
        }
        // חישוב הממוצע
        int sum = 0;
        for (int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        double avg = (double) sum / arr.length;
        System.out.println(avg);
        // הדפסת מספרים על פי תנאי
        for (int i=0; i<arr.length; i++){
            if (arr[i] > avg){
                System.out.println(arr[i]);
            }
        }
    }

    // ex2
    public static String[] hitzonit(Garbage[] garbages){
        int count = 0;
        for (int i=0; i< garbages.length; i++){
            if (garbages[i].getQuantity() >= garbages[i].getCapacity() / 2){
                count++;
            }
        }

        String[] locations = new String[count]; // מערך מיקומים. זה המערך שנחזיר בסוף התוכנית
        int locationIdx = 0;    // אינדקס רץ, שאנחנו מנהלים באופן ידני
        for (int i=0; i<garbages.length; i++){
            if (garbages[i].getQuantity() >= garbages[i].getCapacity() / 2){
                locations[locationIdx] = garbages[i].getLocation();
                locationIdx++;
            }
        }

        return locations;
    }

    // ex3
    static boolean isCopyK(String s1, String s2){
        // s1="ABCD|ABCD|ABCD"
        // s2="ABCD"
        for ( int i=0; i<s1.length(); i+=s2.length() ){
            for (int j=0; j<s2.length(); j++){
                if(s1.charAt(i+j) != s2.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
    static boolean isCopyK_2(String s1, String s2){
        // s1="ABCD|ABCD|ABCD"
        // s2="ABCD"
        for ( int i=0; i<s1.length(); i+=s2.length() ){
            if(s1.substring(i, i+s2.length()).equals(s2) == false){
                return false;
            }
        }
        return true;
    }
    static boolean isCopyK_3(String s1, String s2){ // שימוש בחשבון שאריות
        // s1="ABCD|ABCD|ABCD"
        // s2="ABCD"
        for ( int i=0; i<s1.length(); i++ ){
            if(s1.charAt(i) != s2.charAt(i % s2.length())){
                return false;
            }
        }
        return true;
    }

    // ex4
    public static int ex4(int[] arr){
        // נחפש מספר מקסימלי (פסגה אופציונלית)
        int max= arr[0], maxIdx = 0;
        for (int i=1; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
                maxIdx = i;
            }
        }
        // בדיקה האם עולה-יורד
        for (int i=0; i<maxIdx; i++){   // בודקים עליה
            if (arr[i] > arr[i+1]){
                return -1;
            }
        }
        for (int i=maxIdx+1; i< arr.length; i++){   // בודקים ירידה
            if (arr[i] < arr[i+1]){
                return -1;
            }
        }
        // אם כל הבדיקות עברו, אז מצאנו מערך עולה-יורד ויש לנו את אינדקס הפסגה
        return maxIdx;
    }
}
